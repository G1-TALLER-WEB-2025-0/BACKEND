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
                git branch:'main', changelog:false, poll:false,url:'https://github.com/G1-TALLER-WEB-2025-0/BACKEND'
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
            }
        }

    } // End of stages
} // End of pipeline