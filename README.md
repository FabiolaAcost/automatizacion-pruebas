# Automatización de Pruebas - Taller Unidad II

## 1. Descripción del proyecto
Este proyecto tiene como finalidad implementar un flujo de
automatización de pruebas en una aplicación Java, utilizando
herramientas de integración continua y buenas prácticas de
desarrollo de software.

Se utiliza Maven para la gestión de dependencias, JUnit 5 para
la ejecución de pruebas unitarias, Git para el control de
versiones y GitHub Actions para automatizar los procesos
de compilación, pruebas y generación de reportes.

Como funcionalidad inicial, se implementó una clase
Calculadora que permite realizar operaciones de suma y resta,
las cuales son validadas mediante pruebas unitarias atómicas
e independientes.

El proyecto se desarrolla como parte del Taller de
Evaluación de la Unidad II de Automatización de Pruebas.

## 2. Objetivos

### Objetivo general

Implementar un proceso de automatización de pruebas
en un proyecto Java mediante herramientas de control
de versiones, pruebas unitarias e integración continua,
con el propósito de mejorar la calidad del software
y facilitar la detección temprana de errores.

### Objetivos específicos

- Configurar un proyecto Java con Maven y JUnit 5.
- Implementar pruebas unitarias atómicas e independientes.
- Aplicar buenas prácticas de gestión de versiones
  mediante Git y GitHub.
- Automatizar la compilación y ejecución de pruebas
  utilizando GitHub Actions.
- Generar reportes HTML de pruebas mediante Maven
  Surefire Report Plugin.
- Publicar los reportes como artefactos accesibles
  desde GitHub Actions.
- Documentar la estructura, configuración y
  ejecución del proyecto.
## 3. Tecnologías utilizadas

El proyecto utiliza las siguientes tecnologías:

| Tecnología | Versión | Propósito |
|------------|---------|-----------|
| Java | 17 | Lenguaje de programación principal. |
| Apache Maven | 3.9.9 | Gestión de dependencias y construcción del proyecto. |
| JUnit Jupiter | 5.11.0 | Implementación y ejecución de pruebas unitarias. |
| Maven Surefire Plugin | 3.3.0 | Ejecución automatizada de pruebas con Maven. |
| Maven Surefire Report Plugin | 3.6.0 | Generación de reportes HTML de pruebas. |
| Git | 2.45.2 | Control de versiones y gestión de ramas. |
| GitHub | Plataforma remota | Almacenamiento del repositorio y colaboración. |
| GitHub Actions | Servicio CI | Automatización de compilación, pruebas y reportes. |
| Visual Studio Code | IDE | Desarrollo y ejecución local del proyecto. |

Estas herramientas permiten desarrollar y validar el software,
mantener la trazabilidad de los cambios y automatizar la
verificación de calidad mediante integración continua.

## 4. Estructura del proyecto

El proyecto sigue la estructura estándar de Maven,
separando el código fuente de las pruebas automatizadas.

```text
automatizacion-pruebas/
├── .github/
│   └── workflows/
│       └── ci.yml
├── .mvn/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── cl/
│   │           └── iplacex/
│   │               ├── App.java
│   │               └── Calculadora.java
│   └── test/
│       └── java/
│           └── cl/
│               └── iplacex/
│                   ├── AppTest.java
│                   └── CalculadoraTest.java
├── .gitignore
├── pom.xml
└── README.md
```

### Descripción de los archivos principales

- **App.java:** clase principal creada inicialmente
  mediante el arquetipo Maven.

- **Calculadora.java:** clase que implementa las
  operaciones de suma y resta de números enteros.

- **AppTest.java:** clase de prueba generada
  inicialmente por Maven.

- **CalculadoraTest.java:** contiene dos pruebas
  unitarias independientes para validar las
  operaciones de suma y resta utilizando JUnit 5.

- **pom.xml:** archivo de configuración de Maven
  que administra las dependencias y plugins
  utilizados en el proyecto.

- **ci.yml:** archivo de GitHub Actions que define
  las etapas de compilación, ejecución de pruebas
  y generación y publicación de reportes HTML.

- **.gitignore:** archivo que especifica los
  archivos y directorios que Git debe ignorar,
  como la carpeta target/ generada por Maven.

- **README.md:** documento que describe los
  objetivos, tecnologías, estructura y
  procedimientos de ejecución del proyecto.

### Organización y buenas prácticas

La estructura del proyecto separa el código de
producción de las pruebas automatizadas mediante
los directorios src/main/java y src/test/java.

Las pruebas se organizan en la clase
CalculadoraTest, donde cada método verifica
un comportamiento específico de Calculadora.

Esta organización favorece la cohesión,
la independencia de las pruebas y la
mantenibilidad del código.

## 5. Configuración del entorno

### 5.1. Requisitos previos

Para ejecutar el proyecto se requiere tener instaladas
las siguientes herramientas:

- Java JDK 17 o compatible con la configuración del proyecto.
- Apache Maven 3.9.9.
- Git.
- Un editor de código, como Visual Studio Code.

### 5.2. Verificar las herramientas

Para verificar las herramientas instaladas,
ejecutar los siguientes comandos:

```bash
java -version
mvn -version
git --version
```

### 5.3. Clonar el repositorio

Para obtener el código fuente desde GitHub:

```bash
git clone https://github.com/FabiolaAcost/automatizacion-pruebas.git
```

Ingresar a la carpeta del proyecto:

```bash
cd automatizacion-pruebas
```

Seleccionar la rama de desarrollo:

```bash
git checkout develop
```

### 5.4. Compilar el proyecto

Para limpiar los archivos generados y compilar
el código fuente:

```bash
mvn clean compile
```

Este comando elimina los archivos de compilaciones
anteriores y compila las clases Java del proyecto.

Si la compilación se ejecuta correctamente,
Maven mostrará el mensaje BUILD SUCCESS.

## 6. Ejecución de pruebas unitarias

El proyecto utiliza JUnit 5 para implementar pruebas
unitarias de las operaciones de la clase Calculadora.

### 6.1. Pruebas implementadas

Se desarrollaron dos pruebas unitarias:

- testSumar(): valida la suma de dos números enteros.
- testRestar(): valida la resta de dos números enteros.

Cada prueba verifica un comportamiento específico y
utiliza su propia instancia de Calculadora, evitando
dependencias entre los casos de prueba.

Las pruebas siguen el patrón Arrange, Act, Assert (AAA):

1. Arrange: preparación de los datos.
2. Act: ejecución de la operación.
3. Assert: verificación del resultado esperado.

### 6.2. Ejecutar todas las pruebas

Desde la raíz del proyecto, ejecutar:

```bash
mvn clean test
```

Maven compila el código y ejecuta automáticamente
las pruebas mediante Maven Surefire Plugin.

### 6.3. Resultados obtenidos

Durante la validación del proyecto se obtuvieron
los siguientes resultados:

| Indicador | Resultado |
|-----------|-----------|
| Pruebas ejecutadas | 3 |
| Fallos | 0 |
| Errores | 0 |
| Pruebas omitidas | 0 |
| Resultado general | BUILD SUCCESS |

Las tres pruebas corresponden a una prueba inicial
de AppTest y dos pruebas de CalculadoraTest.

### 6.4. Generar el reporte HTML

Para ejecutar las pruebas y generar el reporte HTML:

```bash
mvn clean test surefire-report:report
```

El reporte generado se encuentra en:

```text
target/reports/surefire.html
```

Para abrirlo desde PowerShell:

```powershell
start .\target\reports\surefire.html
```

El reporte permite consultar el resumen de ejecución,
los casos de prueba, los fallos, los errores y la
tasa de éxito.

Los resultados de esta ejecución registraron
una tasa de éxito del 100 %.

### 6.5. Buenas prácticas aplicadas

- Cada prueba valida un único comportamiento.
- Los casos de prueba son independientes.
- No se utilizan variables compartidas entre pruebas.
- Se separa el código de producción del código de pruebas.
- La ejecución automatizada permite detectar errores
  antes de integrar nuevos cambios.


## 7. Gestión de versiones con Git

El proyecto utiliza Git como sistema de control de
versiones y GitHub como repositorio remoto.

Se implementó una estrategia de trabajo basada en
ramas independientes para organizar los cambios,
facilitar su integración y mantener la trazabilidad
del desarrollo.

### 7.1. Estrategia de ramas

Se utilizaron las siguientes ramas:

| Rama | Propósito |
|------|-----------|
| main | Mantener la versión principal del proyecto. |
| develop | Integrar y validar los cambios desarrollados. |
| feature/pruebas-unitarias | Implementar pruebas unitarias con JUnit 5. |
| feature/pipeline-ci | Configurar GitHub Actions. |
| feature/reportes-tests | Incorporar la generación y publicación de reportes HTML. |
| docs/readme-proyecto | Documentar la configuración y ejecución del proyecto. |

Esta organización permite desarrollar los cambios
sin modificar directamente la rama principal.

### 7.2. Commits realizados

Se utilizó la convención Conventional Commits
para identificar el propósito de cada modificación.

Los principales tipos utilizados fueron:

- chore: configuración y estructura inicial.
- build: configuración de Maven y sus plugins.
- feat: implementación de funcionalidades.
- test: incorporación de pruebas automatizadas.
- ci: configuración de integración continua.
- docs: actualización de documentación.

Ejemplos de commits realizados:

```text
chore: estructura inicial del proyecto Maven
build: configurar motor de pruebas JUnit 5
feat: implementar operaciones de suma y resta
test: agregar pruebas unitarias de suma y resta
ci: configurar pipeline de integracion continua
build: configurar generacion de reportes HTML con Surefire
ci: publicar reportes HTML de pruebas en GitHub Actions
```

Cada commit agrupa cambios relacionados con una
responsabilidad específica, facilitando la revisión,
trazabilidad y mantenimiento del proyecto.

### 7.3. Integración mediante Pull Request

Se utilizó un Pull Request para integrar los cambios
de la rama feature/reportes-tests en develop.

El Pull Request #1 incorporó:

- Configuración del pipeline de integración continua.
- Generación de reportes HTML con Maven Surefire.
- Publicación automática de reportes en GitHub Actions.

Antes de realizar la integración, GitHub Actions
ejecutó las verificaciones automáticas configuradas.

Las comprobaciones finalizaron exitosamente y
no se detectaron conflictos entre las ramas.

Posteriormente, se completó el merge del Pull
Request, conservando los commits individuales.

### 7.4. Comandos Git utilizados

Inicializar un repositorio:

```bash
git init
```

Crear una rama:

```bash
git checkout -b nombre-rama
```

Consultar el estado del repositorio:

```bash
git status
```

Agregar archivos específicos:

```bash
git add nombre-archivo
```

Registrar un commit:

```bash
git commit -m "tipo: descripcion del cambio"
```

Publicar una rama en GitHub:

```bash
git push -u origin nombre-rama
```

Actualizar la rama develop:

```bash
git checkout develop
git pull origin develop
```

Visualizar el historial de commits:

```bash
git --no-pager log --oneline --graph --decorate -10
```

### 7.5. Archivo .gitignore

Se configuró el archivo .gitignore para excluir
archivos generados automáticamente y
configuraciones locales del entorno.

Entre los elementos excluidos se encuentran:

- target/
- .vscode/
- .idea/
- *.iml
- *.log

Esto permite mantener el repositorio organizado,
evitando incorporar archivos temporales o
generados durante la compilación.

### 7.6. Beneficios de la gestión de versiones

La estrategia implementada permite:

- Mantener un historial claro de los cambios.
- Separar funcionalidades y configuraciones.
- Facilitar la revisión e integración del código.
- Identificar el propósito de cada commit.
- Validar los cambios antes de integrarlos.
- Mejorar la colaboración y trazabilidad.


## 8. Integración continua con GitHub Actions

### 8.1. Descripción de integración continua

La integración continua (Continuous Integration o CI)
es una práctica de desarrollo que permite integrar
frecuentemente los cambios de código en un
repositorio compartido.

Mediante la ejecución automática de procesos
de compilación y pruebas, permite detectar
errores de forma temprana y proporcionar
retroalimentación al equipo de desarrollo.

En este proyecto se implementó un pipeline de
integración continua utilizando GitHub Actions.

### 8.2. Configuración del pipeline

El pipeline se encuentra definido en el archivo:

`.github/workflows/ci.yml`

Este archivo utiliza el formato YAML para
establecer los eventos que activan el workflow,
el entorno de ejecución y los pasos automatizados.

Se configuraron los siguientes eventos:

- push: activa el pipeline cuando se publican
  cambios en main, develop o ramas feature/**.

- pull_request: activa el pipeline cuando se
  crea o actualiza un Pull Request dirigido
  a main o develop.

Esto permite validar los cambios tanto durante
el desarrollo como antes de integrarlos.

### 8.3. Etapas del pipeline

El pipeline contiene las siguientes etapas:

**1. Descargar código del repositorio**

Se utiliza actions/checkout@v4 para obtener
el código fuente desde GitHub.

**2. Configurar Java 17**

Se utiliza actions/setup-java@v4 con
la distribución Temurin y Java 17.

También se habilita el caché de Maven
para optimizar la descarga de dependencias.

**3. Compilar el proyecto**

Se ejecuta el siguiente comando:

```bash
mvn --batch-mode clean compile
```

Este paso verifica que el código fuente
compile correctamente.

**4. Ejecutar pruebas unitarias**

Se ejecuta:

```bash
mvn --batch-mode test
```

Maven Surefire ejecuta automáticamente
las pruebas implementadas con JUnit 5.

**5. Generar reporte HTML de pruebas**

Se ejecuta:

```bash
mvn --batch-mode surefire-report:report
```

Este paso genera un reporte navegable
con los resultados de las pruebas.

**6. Publicar reporte de pruebas**

Se utiliza actions/upload-artifact@v4
para publicar el reporte como artefacto
descargable del workflow.

El artefacto se denomina:

`reporte-pruebas-junit`

Su período de retención configurado es
de 14 días.

### 8.4. Verificación de la ejecución automática

Se comprobó el funcionamiento del pipeline
mediante los siguientes eventos:

**Ejecución mediante push**

Al publicar la rama feature/pipeline-ci
en GitHub, el workflow se ejecutó
automáticamente y finalizó correctamente.

**Ejecución mediante Pull Request**

Se creó el Pull Request #1 para integrar
feature/reportes-tests en develop.

GitHub Actions ejecutó las verificaciones
automáticas, obteniendo dos comprobaciones
exitosas y sin conflictos de integración.

Posteriormente, el Pull Request fue fusionado
en develop.

### 8.5. Consulta de resultados

Los resultados del pipeline se pueden
consultar desde la pestaña Actions
del repositorio de GitHub:

https://github.com/FabiolaAcost/automatizacion-pruebas/actions

Para revisar una ejecución:

1. Ingresar a la pestaña Actions.
2. Seleccionar el workflow de integración continua.
3. Abrir la ejecución correspondiente.
4. Seleccionar el job de compilación y pruebas.
5. Revisar los registros de cada etapa.

Si alguna etapa falla, GitHub Actions
identifica el job y el paso afectado,
permitiendo revisar los registros
para investigar el problema.

### 8.6. Beneficios de la implementación

La integración continua permite:

- Detectar problemas de compilación tempranamente.
- Ejecutar pruebas automáticamente.
- Validar cambios antes de integrarlos.
- Mantener visibilidad sobre los resultados.
- Reducir errores durante la integración.
- Facilitar el trabajo colaborativo.
- Mejorar la trazabilidad de las ejecuciones.


## 9. Generación y consulta de reportes HTML

El proyecto utiliza Maven Surefire Report Plugin para
generar reportes HTML con los resultados de las
pruebas unitarias.

### Generación local

Ejecutar:

```bash
mvn clean test surefire-report:report
```

El reporte se genera en:

`target/reports/surefire.html`

### Reportes en GitHub Actions

El pipeline genera y publica automáticamente
los reportes mediante `actions/upload-artifact@v4`.

Para consultar los resultados:

1. Ingresar a la pestaña Actions del repositorio.
2. Seleccionar una ejecución del workflow.
3. Descargar el artefacto `reporte-pruebas-junit`.
4. Extraer el ZIP y abrir `surefire.html` en un navegador.

Los artefactos tienen una retención configurada
de 14 días.

### Resultados obtenidos

| Indicador | Resultado |
|-----------|-----------|
| Pruebas ejecutadas | 3 |
| Pruebas exitosas | 3 |
| Fallos | 0 |
| Errores | 0 |
| Tasa de éxito | 100 % |

Los reportes permiten consultar el resumen y
los casos de prueba, facilitando el seguimiento
de la calidad del software.

## 10. BDD con Cucumber

## 11. Pruebas de performance

## 12. Métricas, dashboards y alertas

## 13. Resultados, evidencias y conclusiones