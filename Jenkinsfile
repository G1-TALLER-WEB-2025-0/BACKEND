pipeline {
    agent any
        tools {
        jdk 'JAVA'
        maven 'maven'
    }
    environment {
        SCANNER_HOME = tool 'sonar-scanner'
    }
        stages {
        stage("Git Checkout") {
            steps {
                git branch:'merge_spopovich.feature', changelog:false, poll:false,url:'https://github.com/G1-TALLER-WEB-2025-0/BACKEND'
            }
        }
        stage("Build with Maven") {
            steps {
                //echo "Build skipped"
				
                bat "mvn -f Plataforma-Educativa/Plataforma-Educativa clean compile -Dcheckstyle.skip=true"
            }
        }
        stage("Run Unit Tests") {
            steps {
                //echo "Unit Tests skipped"
				
                bat "mvn -f Plataforma-Educativa/Plataforma-Educativa test -Dcheckstyle.skip=true"
            }
        }
        stage("SonarQube Analysis") {
            steps {
                //echo "SonarQube Analysis skipped"
                
			bat """
			mvn -f Plataforma-Educativa/Plataforma-Educativa/pom.xml clean verify sonar:sonar ^
			  -Dsonar.projectKey=epd ^
			  -Dsonar.projectName=EPD ^
			  -Dsonar.host.url=http://localhost:9000 ^
			  -Dsonar.sources=src/main/java/com/Plataforma_Educativa ^
			  -Dsonar.tests=src/test/java/com/Plataforma_Educativa ^
			  -Dsonar.exclusions=**/test/** ^
			  -Dsonar.token=squ_7c9288b902d76f3e86af03ac7a208ee03116db30 ^
			  -DskipTests
			"""
                
            }
        }
		stage("Deploy ") {
            steps {
                echo "Maven deploy skipped"
				
			//bat "mvn -f Plataforma-Educativa/Plataforma-Educativa wrapper:wrapper"
			//bat "mvn -f Plataforma-Educativa/Plataforma-Educativa spring-boot:run -Dcheckstyle.skip=true"
			bat 'start /B mvn -f Plataforma-Educativa/Plataforma-Educativa spring-boot:run -Dspring-boot.run.arguments="--server.port=9090"'
			sleep 30
            }
        }
		stage('Run Postman Tests') {
            steps {
                script {
                    // Run Postman collection
                    bat 'cd /d C:\\Users\\angel\\Desktop\\postman && postman collection run "Pruebas de aceptacion.postman_collection.json"'
                }
            }
        }
		stage('Stop Spring Boot') {
            steps {
                script {
                    // Find and kill the Java process running Spring Boot
                    bat 'wmic process where "name=\'java.exe\' and commandline like \'%spring-boot:run%\'" call terminate'
                }
            }
        }

    } // End of stages
} // End of pipeline
