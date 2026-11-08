# Automatización de Pruebas - Taller Unidad II

## 1. Descripción del proyecto

Este proyecto tiene como finalidad implementar un proceso de
automatización de pruebas en una aplicación Java 17, utilizando
herramientas de integración continua, BDD y buenas prácticas
de desarrollo de software.

Durante la Actividad 1 se configuró un proyecto Maven con
pruebas unitarias JUnit 5 para validar operaciones de suma
y resta. También se implementó un pipeline de integración
continua mediante GitHub Actions y se configuró la generación
de reportes HTML.

En la Actividad 2 se incorporó una funcionalidad básica de
inicio de sesión, validada mediante escenarios Gherkin,
Cucumber y JUnit 5. Además, se diseñó y ejecutó una prueba
de rendimiento con Apache JMeter para evaluar la lógica
Java del login.

Como complemento, se desarrolló un dashboard demostrativo
con HTML y CSS para visualizar los resultados funcionales
y de performance, junto con una propuesta de alertas
automáticas ante fallos o degradaciones.

El proyecto corresponde al Taller de Evaluación de la
Unidad II de Automatización de Pruebas de IPLACEX.

## 2. Objetivos

### Objetivo general

Implementar un proceso de automatización de pruebas en un
proyecto Java 17, integrando pruebas unitarias, BDD,
integración continua y evaluación de rendimiento, con el
propósito de mejorar la calidad del software y facilitar
la detección temprana de errores.

### Objetivos específicos

- Configurar un proyecto Java utilizando Maven y JUnit 5.
- Implementar pruebas unitarias atómicas e independientes.
- Aplicar buenas prácticas de control de versiones con Git.
- Automatizar la compilación y ejecución de pruebas
  mediante GitHub Actions.
- Generar y publicar reportes HTML de pruebas automatizadas.
- Definir criterios de aceptación mediante la técnica
  Three Amigos.
- Implementar escenarios Gherkin y automatizarlos
  utilizando Cucumber y JUnit 5.
- Diseñar y ejecutar una prueba básica de rendimiento
  utilizando Apache JMeter.
- Analizar indicadores de rendimiento, incluyendo tiempos
  de respuesta, throughput y tasa de errores.
- Desarrollar un dashboard demostrativo para visualizar
  métricas funcionales y de performance.
- Proponer alertas automáticas ante fallos de pruebas
  y degradaciones del rendimiento.
- Documentar la configuración, ejecución y resultados
  del proyecto en el README.md.

## 3. Tecnologías utilizadas

El proyecto utiliza las siguientes tecnologías para implementar
pruebas automatizadas, integración continua, evaluación de
rendimiento y visualización de métricas.

| Tecnología | Versión | Propósito |
|---|---|---|
| Java | 17 | Lenguaje de programación principal. |
| Apache Maven | 3.9.9 | Gestión de dependencias y construcción del proyecto. |
| JUnit Jupiter | 5.11.0 | Implementación de pruebas unitarias. |
| JUnit Platform Suite | 1.11.0 | Ejecución de escenarios Cucumber mediante JUnit 5. |
| Cucumber | 7.20.1 | Automatización de escenarios BDD definidos en Gherkin. |
| Maven Surefire Plugin | 3.3.0 | Ejecución automatizada de pruebas mediante Maven. |
| Maven Surefire Report Plugin | 3.6.0 | Generación de reportes HTML de pruebas. |
| Apache JMeter | 5.6.3 | Diseño y ejecución de pruebas de rendimiento. |
| Groovy | 3.0.20 (JMeter) | Ejecución de la lógica Java mediante JSR223 Sampler. |
| HTML5 y CSS3 | — | Desarrollo del dashboard demostrativo de métricas. |
| Git | 2.45.2 | Control de versiones y gestión de ramas. |
| GitHub | Plataforma remota | Almacenamiento del repositorio y gestión de Pull Requests. |
| GitHub Actions | Servicio CI | Automatización de pruebas y publicación de reportes. |
| Visual Studio Code | Editor de código | Desarrollo y ejecución local del proyecto. |

Estas tecnologías permiten automatizar pruebas funcionales
y BDD, evaluar el rendimiento de la lógica de negocio y
presentar los resultados mediante reportes y un dashboard
demostrativo.

La ejecución de JMeter se realiza localmente, mientras que
JUnit y Cucumber se ejecutan tanto localmente como en
GitHub Actions.

## 4. Estructura del proyecto

El proyecto sigue la estructura estándar de Maven, separando
el código fuente, las pruebas automatizadas y los recursos
utilizados para BDD, performance y visualización de métricas.

```text
automatizacion-pruebas/
├── .github/
│   └── workflows/
│       └── ci.yml
├── .mvn/
├── dashboard/
│   ├── index.html
│   └── styles.css
├── performance/
│   └── login-performance.jmx
├── src/
│   ├── main/
│   │   └── java/
│   │       └── cl/
│   │           └── iplacex/
│   │               ├── App.java
│   │               ├── Calculadora.java
│   │               └── LoginService.java
│   └── test/
│       ├── java/
│       │   └── cl/
│       │       └── iplacex/
│       │           ├── AppTest.java
│       │           ├── CalculadoraTest.java
│       │           └── bdd/
│       │               ├── LoginSteps.java
│       │               └── RunCucumberTest.java
│       └── resources/
│           └── features/
│               └── login.feature
├── .gitignore
├── pom.xml
└── README.md
```

### Descripción de los archivos principales

| Archivo | Descripción |
|---|---|
| `App.java` | Clase principal generada inicialmente por Maven. |
| `Calculadora.java` | Implementa las operaciones de suma y resta. |
| `LoginService.java` | Contiene la lógica de validación del inicio de sesión. |
| `AppTest.java` | Prueba inicial generada por Maven. |
| `CalculadoraTest.java` | Contiene las pruebas unitarias de suma y resta con JUnit 5. |
| `login.feature` | Define los escenarios BDD mediante Gherkin. |
| `LoginSteps.java` | Implementa los pasos Given, When y Then utilizando Cucumber. |
| `RunCucumberTest.java` | Configura la ejecución de escenarios BDD y la generación del reporte HTML. |
| `login-performance.jmx` | Contiene el plan de prueba de rendimiento desarrollado con JMeter. |
| `index.html` | Presenta las métricas funcionales y de performance del dashboard. |
| `styles.css` | Define los estilos visuales del dashboard. |
| `pom.xml` | Administra las dependencias y plugins de Maven. |
| `ci.yml` | Configura la ejecución automática de pruebas y publicación de reportes en GitHub Actions. |
| `.gitignore` | Excluye archivos temporales y generados automáticamente. |
| `README.md` | Documenta la configuración, ejecución y resultados del proyecto. |

### Organización y buenas prácticas

La estructura mantiene separadas las responsabilidades
de implementación, pruebas y documentación.

- `src/main/java`: contiene la lógica de negocio de la aplicación.
- `src/test/java`: contiene las pruebas JUnit y los step definitions de Cucumber.
- `src/test/resources/features`: almacena los escenarios Gherkin.
- `performance`: contiene el plan de carga reproducible de JMeter.
- `dashboard`: contiene la interfaz HTML y sus estilos CSS.
- `.github/workflows`: contiene la configuración del pipeline de integración continua.

Esta organización favorece la cohesión, el bajo acoplamiento
y la mantenibilidad del proyecto.

Además, la lógica de autenticación se encuentra en
`LoginService.java`, separada de los step definitions,
siguiendo las buenas prácticas recomendadas para BDD.

## 5. Configuración del entorno

### 5.1. Requisitos previos

Para ejecutar el proyecto se requiere:

- Java JDK 17.
- Apache Maven 3.9.9.
- Git.
- Apache JMeter 5.6.3, para las pruebas de rendimiento.
- Un editor de código, como Visual Studio Code.

Las dependencias de JUnit 5 y Cucumber se administran
mediante Maven, por lo que no requieren instalación manual.

### 5.2. Verificar las herramientas

Para comprobar las versiones instaladas, ejecutar:

```bash
java -version
mvn -version
git --version
```

Se debe verificar que Maven utilice Java 17,
conforme a la configuración establecida en `pom.xml`.

### 5.3. Clonar el repositorio

Para obtener el proyecto desde GitHub:

```bash
git clone https://github.com/FabiolaAcost/automatizacion-pruebas.git
```

Ingresar a la carpeta del proyecto:

```bash
cd automatizacion-pruebas
```

Una vez completada la integración mediante Pull Request,
la rama `main` contendrá la versión final del proyecto.

Para trabajar con la rama de desarrollo:

```bash
git switch develop
```

### 5.4. Compilar el proyecto

Para limpiar los archivos generados y compilar
el código fuente:

```bash
mvn clean compile
```

Si el proceso finaliza correctamente, Maven mostrará
el mensaje `BUILD SUCCESS`.

### 5.5. Dependencias de pruebas automatizadas

El proyecto utiliza JUnit 5 y Cucumber para ejecutar
pruebas unitarias y escenarios BDD.

Las dependencias están definidas en `pom.xml` y Maven
las descarga automáticamente durante la construcción
del proyecto.

Para ejecutar todas las pruebas:

```bash
mvn clean test
```

Este comando ejecuta las pruebas unitarias JUnit y
los escenarios BDD de Cucumber.

En la ejecución validada se obtuvieron ocho pruebas
exitosas: tres pruebas JUnit y cinco casos BDD,
sin fallos ni errores.

### 5.6. Preparación de Apache JMeter

Para las pruebas de rendimiento se utilizó
Apache JMeter 5.6.3, ejecutado localmente en Windows 11.

1. Descargar Apache JMeter desde su sitio oficial:
   https://jmeter.apache.org/download_jmeter.cgi
2. Extraer el archivo descargado.
3. Abrir `bin/jmeter.bat`.
4. Cargar el plan `performance/login-performance.jmx`.

El plan utiliza un JSR223 Sampler con Groovy para
ejecutar directamente la clase `LoginService`.

Antes de ejecutar la prueba, es necesario generar
el archivo JAR del proyecto:

```bash
mvn package -DskipTests
```

El archivo se genera en:

```text
target/automatizacion-pruebas-1.0-SNAPSHOT.jar
```

Este JAR debe agregarse al classpath de JMeter desde
la sección **Test Plan → Add directory or jar to classpath**.

La ejecución de la prueba de rendimiento y el análisis
de sus métricas se documentan en la sección 11.

## 6. Ejecución de pruebas unitarias

El proyecto utiliza JUnit 5 para implementar pruebas
unitarias sobre las operaciones de la clase Calculadora.

Estas pruebas se desarrollaron durante la Actividad 1
y se mantienen como parte de la suite automatizada.

### 6.1. Pruebas implementadas

Se implementaron dos pruebas unitarias independientes:

- `testSumar()`: verifica que 5 + 3 = 8.
- `testRestar()`: verifica que 10 - 4 = 6.

Ambas se encuentran en `CalculadoraTest.java` y utilizan
el patrón Arrange, Act, Assert (AAA):

1. **Arrange:** preparación de los datos.
2. **Act:** ejecución de la operación.
3. **Assert:** verificación del resultado esperado.

Cada prueba valida un comportamiento específico,
sin depender de los resultados de otras pruebas.

Además, el proyecto conserva `AppTest.java`, que
contiene una prueba generada inicialmente por Maven.

### 6.2. Ejecutar las pruebas automatizadas

Desde la raíz del proyecto, ejecutar:

```bash
mvn clean test
```

Maven Surefire ejecuta las pruebas JUnit 5 y los
escenarios BDD configurados mediante Cucumber.

En la versión completa del proyecto, este comando
ejecuta ocho pruebas automatizadas:

- 3 pruebas JUnit.
- 5 casos BDD de Cucumber.

Los escenarios BDD se explican en la sección 10.

### 6.3. Resultados obtenidos

Durante la Actividad 1 se verificó la ejecución
exitosa de tres pruebas JUnit.

| Indicador | Resultado |
|---|---|
| Pruebas JUnit ejecutadas | 3 |
| Pruebas exitosas | 3 |
| Fallos | 0 |
| Errores | 0 |
| Pruebas omitidas | 0 |
| Tasa de éxito | 100 % |

Posteriormente, con la incorporación de Cucumber
en la Actividad 2, se verificó una ejecución completa
con ocho pruebas exitosas y el resultado `BUILD SUCCESS`.

### 6.4. Generar el reporte HTML

Para ejecutar las pruebas y generar el reporte
mediante Maven Surefire Report Plugin:

```bash
mvn clean test surefire-report:report
```

El reporte se genera en:

```text
target/reports/surefire.html
```

Para abrirlo desde PowerShell:

```powershell
start .\target\reports\surefire.html
```

El reporte permite consultar los resultados de las
pruebas ejecutadas mediante Maven Surefire.

Adicionalmente, Cucumber genera un reporte HTML
específico para los escenarios BDD en:

```text
target/cucumber-reports/cucumber.html
```

La generación y publicación de ambos reportes
se documenta en la sección 9.

### 6.5. Buenas prácticas aplicadas

- Pruebas unitarias atómicas e independientes.
- Separación entre código de producción y pruebas.
- Aplicación del patrón Arrange, Act, Assert.
- Ejecución automatizada mediante Maven.
- Conservación de las pruebas existentes al incorporar BDD.
- Integración de las pruebas en GitHub Actions.

## 7. Gestión de versiones con Git

El proyecto utiliza Git y GitHub para mantener la trazabilidad
de los cambios y facilitar su integración mediante Pull Requests.

### 7.1. Estrategia de ramas

Se utilizó el siguiente flujo de trabajo:

```text
feature/* → develop → main
```

- `main`: versión principal del proyecto.
- `develop`: integración y validación de cambios.
- `feature/*`: desarrollo de funcionalidades y pruebas.
- `docs/*`: actualización de documentación.

Durante la Actividad 2 se trabajó en la rama
`feature/escenarios-bdd`, incorporando Cucumber, la
funcionalidad de login, JMeter y el dashboard de métricas.

### 7.2. Commits y buenas prácticas

Se utilizó la convención Conventional Commits, con mensajes
descriptivos y cambios separados según su responsabilidad
(`feat`, `test`, `build`, `ci`, `docs`).

Antes de cada commit se revisaron los archivos modificados
mediante `git status` y `git diff --cached --stat`.

El historial completo se encuentra disponible en GitHub.

### 7.3. Integración mediante Pull Requests

Los cambios se validan automáticamente mediante GitHub Actions
antes de integrarse a las ramas principales.

Durante el desarrollo se utilizaron Pull Requests para
revisar los cambios, verificar las pruebas automatizadas
y conservar la trazabilidad de las integraciones.

### 7.4. Archivo .gitignore

Se configuró `.gitignore` para excluir archivos generados
automáticamente y configuraciones locales, como `target/`,
`.vscode/` y `.idea/`.

Esto permite mantener el repositorio limpio y organizado.


## 8. Integración continua con GitHub Actions

El proyecto utiliza GitHub Actions para automatizar la
compilación, ejecución de pruebas y publicación de reportes.

El pipeline está definido en `.github/workflows/ci.yml`
y se activa mediante:

- `push` hacia `main`, `develop` y `feature/**`.
- `pull_request` hacia `main` y `develop`.

### 8.1. Etapas del pipeline

| Etapa | Herramienta o comando |
|---|---|
| Descargar código | `actions/checkout@v4` |
| Configurar Java 17 | `actions/setup-java@v4` |
| Compilar proyecto | `mvn --batch-mode clean compile` |
| Ejecutar pruebas JUnit y BDD | `mvn --batch-mode test` |
| Generar reporte Surefire | `mvn --batch-mode surefire-report:report` |
| Publicar reportes HTML | `actions/upload-artifact@v4` |

Los reportes JUnit y Cucumber se publican como artefactos
independientes, con una retención de 14 días.

### 8.2. Validación de integración continua

El pipeline fue ejecutado exitosamente en GitHub Actions,
verificando:

- 3 pruebas JUnit exitosas.
- 5 casos BDD de Cucumber exitosos.
- 0 fallos y 0 errores.
- Resultado general: `BUILD SUCCESS`.

Los resultados y artefactos están disponibles en:

https://github.com/FabiolaAcost/automatizacion-pruebas/actions

## 9. Generación y consulta de reportes HTML

El proyecto genera reportes HTML para consultar los resultados
de las pruebas JUnit 5 y los escenarios BDD de Cucumber.

### 9.1. Generación local

Para ejecutar las pruebas y generar ambos reportes:

```bash
mvn clean test surefire-report:report
```

| Reporte | Ubicación |
|---|---|
| JUnit / Surefire | `target/reports/surefire.html` |
| Cucumber BDD | `target/cucumber-reports/cucumber.html` |

El reporte Surefire presenta los resultados de las pruebas
ejecutadas mediante Maven, mientras que el reporte Cucumber
permite navegar por los escenarios Gherkin y sus pasos.

### 9.2. Consulta de reportes en GitHub Actions

El pipeline publica los reportes como artefactos descargables:

- `reporte-pruebas-junit`
- `reporte-pruebas-cucumber`

Para consultarlos:

1. Ingresar a la pestaña **Actions** del repositorio.
2. Seleccionar una ejecución del pipeline.
3. Descargar el artefacto correspondiente.
4. Extraer el ZIP y abrir el archivo HTML en un navegador.

Los artefactos tienen una retención configurada de 14 días.

### 9.3. Resultados verificados

Se comprobó la ejecución exitosa de las 8 pruebas
automatizadas, sin fallos ni errores.

El reporte específico de Cucumber registró 5 casos BDD
exitosos, con una tasa de éxito del 100 %.

Ambos reportes fueron generados y publicados correctamente
en GitHub Actions.


## 10. BDD con Cucumber

Se implementaron pruebas BDD para una funcionalidad básica
de inicio de sesión, utilizando Java 17, Cucumber 7.20.1
y JUnit 5.

### 10.1. Sesión Three Amigos

Se simuló una sesión colaborativa con tres perspectivas:

- **Negocio:** definir las reglas de autenticación.
- **QA:** establecer criterios de aceptación y casos de prueba.
- **Desarrollo:** definir la implementación y automatización.

Se acordaron los siguientes criterios de aceptación:

- Permitir el acceso con credenciales correctas.
- Rechazar contraseñas incorrectas.
- Rechazar usuarios inexistentes.
- Rechazar campos vacíos.

### 10.2. Escenarios Gherkin

Los escenarios se encuentran en
`src/test/resources/features/login.feature`.

Se implementaron:

- Un `Scenario` para credenciales correctas.
- Un `Scenario Outline` con cuatro combinaciones
  de credenciales inválidas mediante `Examples`.

En total, se definieron cinco casos BDD.

### 10.3. Implementación técnica

| Archivo | Responsabilidad |
|---|---|
| `LoginService.java` | Implementa la validación de credenciales. |
| `LoginSteps.java` | Conecta los pasos Given, When y Then con la lógica Java. |
| `RunCucumberTest.java` | Configura la suite Cucumber con JUnit 5. |
| `login.feature` | Contiene los escenarios y ejemplos Gherkin. |

La lógica de negocio se mantiene separada de los
step definitions, siguiendo buenas prácticas de BDD.

### 10.4. Ejecución y resultados

Para ejecutar los escenarios junto con las pruebas JUnit:

```bash
mvn clean test
```

La ejecución validada registró:

- 5 casos BDD exitosos.
- 3 pruebas JUnit exitosas.
- 0 fallos y 0 errores.
- Resultado general: `BUILD SUCCESS`.

Los escenarios también se ejecutan automáticamente
mediante GitHub Actions. Sus resultados se pueden
consultar en el reporte HTML de Cucumber descrito
en la sección 9.

## 11. Pruebas de performance

Se diseñó y ejecutó una prueba básica de rendimiento
sobre la funcionalidad de login utilizando Apache JMeter
5.6.3 y un JSR223 Sampler con Groovy.

La prueba ejecuta directamente el método `iniciarSesion()`
de `LoginService.java`, sin utilizar una API HTTP.

### 11.1. Configuración de la prueba

El plan se encuentra en `performance/login-performance.jmx`
y utiliza la siguiente configuración:

| Parámetro | Valor |
|---|---|
| Usuarios virtuales | 10 |
| Ramp-up | 10 segundos |
| Repeticiones por usuario | 10 |
| Ejecuciones totales | 100 |

### 11.2. Ejecución

Para ejecutar la prueba:

1. Generar el JAR mediante `mvn package -DskipTests`.
2. Abrir Apache JMeter y cargar `login-performance.jmx`.
3. Agregar el JAR generado en `target/` al classpath del Test Plan.
4. Ejecutar la prueba y consultar el componente Summary Report.

La ejecución se realizó localmente. La prueba de
performance no está integrada automáticamente
en GitHub Actions.

### 11.3. Resultados obtenidos

| Indicador | Resultado |
|---|---|
| Ejecuciones | 100 |
| Tiempo promedio | 0 ms (redondeado) |
| Tiempo máximo | 16 ms |
| Desviación estándar | 1,63 ms |
| Throughput | 11,1 operaciones/segundo |
| Tasa de errores | 0 % |

Las 100 ejecuciones finalizaron sin errores.

El throughput representa las operaciones procesadas
por segundo durante la prueba. El tiempo promedio de
0 ms corresponde al redondeo de JMeter.

Estas métricas corresponden a la ejecución local de
la lógica Java y no incluyen latencia de red ni
procesamiento de un servidor HTTP.

## 12. Métricas, dashboards y alertas

Se desarrolló un dashboard web para visualizar las
métricas de calidad obtenidas durante las pruebas
automatizadas y de rendimiento.

### 12.1. Dashboard de calidad

El dashboard se encuentra en `dashboard/index.html`
y utiliza `dashboard/styles.css` para su presentación.

Para visualizarlo, abrir `dashboard/index.html`
en un navegador web.

Presenta las siguientes métricas:

| Indicador | Resultado |
|---|---|
| Pruebas JUnit | 3/3 exitosas |
| Casos BDD | 5/5 exitosos |
| Ejecuciones JMeter | 100 |
| Throughput | 11,1 operaciones/segundo |
| Tiempo máximo | 16 ms |
| Tasa de errores | 0 % |

Los valores fueron incorporados manualmente a partir
de los resultados verificados. El dashboard es estático
y no consulta automáticamente los reportes del pipeline.

### 12.2. Alertas y umbrales

Se definieron los siguientes umbrales como propuesta
de monitoreo de calidad:

| Indicador | Condición de alerta |
|---|---|
| Pruebas funcionales | 1 o más fallos |
| Tiempo máximo de respuesta | Superior a 100 ms |
| Tasa de errores JMeter | Superior al 1 % |

Las alertas de rendimiento corresponden a una propuesta;
estos umbrales no están automatizados en el pipeline.

Adicionalmente, se configuraron las notificaciones de
GitHub Actions para recibir avisos por correo electrónico
ante ejecuciones fallidas del workflow.

### 12.3. Integración futura

Como mejora futura, el dashboard podría obtener
automáticamente las métricas desde los reportes de
JUnit, Cucumber y JMeter, permitiendo actualizar
los resultados después de cada ejecución.

## 13. Resultados, evidencias y conclusiones

### 13.1. Resultados generales

Se completaron las actividades de automatización de
pruebas, integración continua y monitoreo básico
de calidad del software.

Los resultados obtenidos fueron:

- Ejecución exitosa de las pruebas JUnit 5 y Cucumber.
- Generación y publicación de reportes HTML en GitHub Actions.
- Ejecución local de pruebas de rendimiento con JMeter.
- Implementación de un dashboard web de métricas.
- Configuración de notificaciones ante fallos del pipeline.

### 13.2. Evidencias del proyecto

Las implementaciones y sus resultados pueden consultarse
en los siguientes recursos:

| Recurso | Ubicación |
|---|---|
| Código fuente y pruebas | `src/` |
| Pipeline CI | `.github/workflows/ci.yml` |
| Prueba de rendimiento | `performance/login-performance.jmx` |
| Dashboard de calidad | `dashboard/index.html` |
| Historial de commits y Pull Requests | Repositorio GitHub |
| Ejecuciones y artefactos CI | GitHub Actions |

**Repositorio:**
https://github.com/FabiolaAcost/automatizacion-pruebas

**GitHub Actions:**
https://github.com/FabiolaAcost/automatizacion-pruebas/actions

### 13.3. Conclusiones

El proyecto permitió aplicar técnicas de automatización
de pruebas funcionales y BDD, complementadas con
integración continua y medición básica de rendimiento.

La ejecución automatizada facilita la detección temprana
de errores y la generación de evidencias verificables.

Como oportunidades de mejora se identifican la
automatización de las pruebas de rendimiento y la
actualización dinámica del dashboard de métricas.