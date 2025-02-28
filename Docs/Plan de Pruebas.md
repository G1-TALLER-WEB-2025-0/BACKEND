# Plan de Pruebas

GradeServiceTest 

| getAll() | Retornar lista de calificaciones | - Tamaño de lista<br>- Llamada a findAll() |
| --- | --- | --- |
| getById() | Retornar calificación existente | - Presencia del resultado<br>- Llamada a findById() |
| getById() | Retornar vacío cuando no existe | - Resultado vacío<br>- Llamada a findById() |
| save() | Guardar nueva calificación | - Resultado no nulo<br>- Llamada a save() |
| delete() | Eliminar calificación existente | - Retorno verdadero<br>- Llamadas a existsById() y deleteById() |
| delete() | Intentar eliminar calificación inexistente | - Retorno falso<br>- Llamada solo a existsById() |

historyServiceTest

| **ID** | **Método Probado** | **Caso de Prueba** | **Escenario** | **Datos de Entrada** | **Resultado Esperado** | **Cobertura** |
| --- | --- | --- | --- | --- | --- | --- |
| T1 | getAll() | getAllShouldReturnListOfHistories | Lista con elementos | Lista mock con 2 historias | Lista con 2 elementos | 100% |
| T2 | getById() | getByIdShouldReturnHistoryWhenExists | Registro existe | ID = 1L | Optional con historia | 100% |
| T3 | getById() | getByIdShouldReturnEmptyWhenNotExists | Registro no existe | ID = 1L | Optional vacío | 100% |
| T4 | save() | saveShouldReturnSavedHistory | Guardar nuevo registro | Objeto history | Historia guardada | 100% |
| T5 | delete() | deleteShouldReturnTrueWhenHistoryExists | Eliminar registro existente | ID = 1L | true | 100% |
| T6 | delete() | deleteShouldReturnFalseWhenHistoryNotExists | Eliminar registro inexistente | ID = 1L |  |  |

MaterialServiceTest

| **ID** | **Método** | **Caso de Prueba** | **Escenario** | **Datos de Entrada** | **Resultado Esperado** | **Cobertura** |
| --- | --- | --- | --- | --- | --- | --- |
| T1 | getAll() | getAllShouldReturnListOfMaterials | Lista con elementos | N/A | Lista con 2 materiales | 100% |
| T2 | getAll() | getAllShouldReturnEmptyList | Lista vacía | N/A | Lista vacía | 100% |
| T3 | getById() | getByIdShouldReturnMaterialWhenExists | Material existe | ID = 1L | Optional con material | 100% |
| T4 | getById() | getByIdShouldReturnEmptyWhenNotExists | Material no existe | ID = 1L | Optional vacío | 100% |
| T5 | save() | saveShouldReturnSavedMaterial | Guardar material | Material con título "Test Material" | Material guardado con datos correctos | 100% |
| T6 | delete() | deleteShouldReturnTrueWhenMaterialExists | Eliminar material existente | ID = 1L | true | 100% |
| T7 | delete() | deleteShouldReturnFalseWhenMaterialNotExists | Eliminar material inexistente | ID = 1L |  |  |

VideoServiceTest

| **ID** | **Método** | **Caso de Prueba** | **Escenario** | **Datos de Entrada** | **Resultado Esperado** | **Cobertura** |
| --- | --- | --- | --- | --- | --- | --- |
| T1 | getAll() | getAllShouldReturnListOfVideos | Lista con elementos | N/A | Lista con 2 videos | 100% |
| T2 | getAll() | getAllShouldReturnEmptyList | Lista vacía | N/A | Lista vacía | 100% |
| T3 | getById() | getByIdShouldReturnVideoWhenExists | Video existe | ID = 1L | Optional con video | 100% |
| T4 | getById() | getByIdShouldReturnEmptyWhenNotExists | Video no existe | ID = 1L | Optional vacío | 100% |
| T5 | save() | saveShouldReturnSavedVideo | Guardar video | Video con atributos completos | Video guardado con datos correctos | 100% |
| T6 | delete() | deleteShouldReturnTrueWhenVideoExists | Eliminar video existente | ID = 1L | true | 100% |
| T7 | delete() | deleteShouldReturnFalseWhenVideoNotExists | Eliminar video inexistente | ID = 1L | fal |  |

ContenidoControllerTest

| **ID** | **Método** | **Caso de Prueba** | **Escenario** | **Datos de Entrada** | **Resultado Esperado** | **Cobertura** |
| --- | --- | --- | --- | --- | --- | --- |
| C1 | subirVideo | subirVideoShouldReturnCreatedContent | Subir nuevo video | ContenidoDTO | ResponseEntity con contenido creado | 100% |
| C2 | obtenerContenidoPorId | obtenerContenidoPorIdShouldReturnContent | Obtener contenido existente | ID = 1L | ResponseEntity con contenido | 100% |
| C3 | obtenerTodosLosContenidos | obtenerTodosLosContenidosShouldReturnList | Listar contenidos | N/A | ResponseEntity con lista de contenidos | 100% |
| C4 | editarContenido | editarContenidoShouldReturnUpdatedContent | Actualizar contenido | ID = 1L, ContenidoDTO | ResponseEntity con contenido actualizado | 100% |
| C5 | eliminarContenido | eliminarContenidoShouldReturnSuccessMessage | Eliminar contenido | ID = |  |  |

CursoControllerTest

| **ID** | **Método** | **Caso de Prueba** | **Escenario** | **Datos de Entrada** | **Resultado Esperado** | **Cobertura** |
| --- | --- | --- | --- | --- | --- | --- |
| K1 | crearCurso | crearCursoShouldReturnCreatedCourse | Crear nuevo curso | CursoDTO | ResponseEntity con curso creado | 100% |
| K2 | editarCurso | editarCursoShouldReturnUpdatedCourse | Actualizar curso | ID = 1L, Curso | ResponseEntity con curso actualizado | 100% |
| K3 | eliminarCurso | eliminarCursoShouldReturnSuccessMessage | Eliminar curso | ID = 1L | ResponseEntity con mensaje de éxito | 100% |
| K4 | obtenerCursoPorID | obtenerCursoPorIDShouldReturnCourse | Obtener curso | ID = 1L | ResponseEntity con curso | 100% |
| K5 | agregarContenido | agregarContenidoShouldReturnAddedContent | Agregar contenido a curso | ID = 1L, Contenido |  |  |