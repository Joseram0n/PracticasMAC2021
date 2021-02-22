# Proyecto Final Modelos Avanzados de Computación
___
Este es el proyecto final para la asignatura "Modelos Avanzados de Computación" de la [:school: Universidad de Huelva](http://www.uhu.es/index.php "UHU").
___

:man_student: Alumno: [José Ramón López Garrido](https://github.com/Joseram0n)

:books: Asignatura: Modelos Avanzados de Computación

:calendar: Curso: 2020-2021
___

## :book: Índice
- [Proyecto Final Modelos Avanzados de Computación](#proyecto-final-modelos-avanzados-de-computación)
  - [:book: Índice](#book-índice)
  - [:information_source: Información General](#information_source-información-general)
  - [:writing_hand: Metodología Seguida](#writing_hand-metodología-seguida)
  - [:nerd_face: Comprendiendo Scala](#nerd_face-comprendiendo-scala)
  - [:computer: Selección de entorno de desarrollo](#computer-selección-de-entorno-de-desarrollo)
  - [:man_technologist: Consideraciones para ejecutar código](#man_technologist-consideraciones-para-ejecutar-código)
  - [:link: Enlaces de interés](#link-enlaces-de-interés)
___
## :information_source: Información General

Este repositorio contiene la actividad numero tres de los proyectos ofrecidos por el profesor para la evaluación de la asignatura.

Enunciado:

>**3. Traducir los ejercicios vistos en clase a Scala**
>
>Escala es un lenguaje de programación multi paradigma que incluye muchas de las características vistas en este curso de programación funcional básica. Una de los usos principales de Scala en la programación para Apache Spark (https://spark.apache.org/docs/0.9.1/scala-programming-guide.html), un sistema de computación en cluster que permite la gestión de grandes volúmenes de datos (https://es.wikipedia.org/wiki/Apache_Spark).

Enlace al enunciado del proyecto: [EnunciadoMAC2021](https://github.com/jcarpio/mac2021/blob/main/proyecto.md)

Enlace al repositorio con los ejercicios: [RepoMAC2021](https://github.com/jcarpio/mac2021)
___
## :writing_hand: Metodología Seguida

La metodología seguida para realizar esta actividad ha sido el uso del [documento aportado por el profesor](http://www.uhu.es/jose.carpio/N_95.pdf) junto a las [clases (grabadas y subidas a la plataforma de YouTube)](https://youtube.com/playlist?list=PL_d-XKRO_5G97S8FCPTWjS3ed09RWYnVl) para aprender Haskell, luego se ha investigado y aprendido acerca del lenguaje Scala de forma autodidacta, a través de una [serie de videos en Youtube](https://youtube.com/playlist?list=PLTd5ehIj0goOlRPRfwGGu9Bc2ap4bt7wR), la [documentación oficial](https://docs.scala-lang.org/)  y acudiendo a foros especializados en programacón como [StackOverflow](https://stackoverflow.com) para resolver dudas, de tal forma que con los conocimientos adquiridos se ha procedido a elaborar una traducción Haskell -> Scala lo mas fiel posible usando siempre las características de la programación funcional de esta ultima.

___
## :nerd_face: Comprendiendo Scala

Para quien no lo sepa Scala es segun la Wikipedia:

>Es un lenguaje de programación multi-paradigma diseñado para expresar patrones comunes de programación en forma concisa, elegante y con tipos seguros. Integra sutilmente características de lenguajes funcionales y orientados a objetos. La implementación actual se ejecuta en la máquina virtual de Java y es compatible con las aplicaciones Java existentes.

Entre los paradigmas que Scala permite programar se encuentra el [lenguaje funcional](https://es.wikipedia.org/wiki/Programaci%C3%B3n_funcional), el cual es el que usamos en este proyecto para replicar las funciones de Haskell trabajadas durante las practicas.

En la documentación oficial hay un apartado llamado "[Tour of Scala](https://docs.scala-lang.org/tour/tour-of-scala.html)" que habla bien resumido de lo básico que hay que saber, pero está tan resumido que deja algunas cuestiones al aire, así que recomiendo la lectura de 2 documentos (en español) que pueden resolver algunas de esas cuestiones: [Prog. Funcional Scala 1](http://www.dccia.ua.es/dccia/inf/asignaturas/LPP/2010-2011/teoria/tema6.html) & [Porg. Funcional Scala 2](http://www.dccia.ua.es/dccia/inf/asignaturas/LPP/2013-14/teoria/).

Tanto Haskell como Scala son muy parecidos, pero cada uno maneja la información a su manera, ejemplo de tipos:

| Haskell | Scala |
| :-----: | :---: |
|![](https://i.stack.imgur.com/Rex1J.png)|![](https://docs.scala-lang.org/resources/images/tour/unified-types-diagram.svg)       |

Como curiosidad Scala está influenciado por Haskell y debido a que esta implementado sobre Java es mas popular que este ultimo.
___
## :computer: Selección de entorno de desarrollo

Para comenzar a trabajar con Scala podemos tomar 2 caminos diferentes, uno seria instalar en el equipo de forma local Scala + algún IDE ( o editor de texto + plugins) y el otro es simplemente trabajar desde la nube sin tener que instalar nada y de forma inmediata, ya que en la página de Scala se promociona un [pequeño IDE Online](https://scastie.scala-lang.org/).

En este caso para realizar el proyecto se ha optado por trabajar en local de la forma mas tradicional, para ello se ha descargado e instalado [Scala 2.13.4](https://www.scala-lang.org/) y el editor de texto [Microsoft Visual Studio Code](https://code.visualstudio.com/) junto a los respectivos plugins como [Sintaxis Oficial Scala](https://marketplace.visualstudio.com/items?itemName=scala-lang.scala) y [Scala Metals](https://marketplace.visualstudio.com/items?itemName=scalameta.metals).

___
## :man_technologist: Consideraciones para ejecutar código

En las versiones mas recientes de Scala puedes crear un proyecto que tiene una función principal de entrada y el código puede estar dividido en varios archivos o puedes trabajar en el modo "WoorkShet", que sirve para evaluar pequeños trozos de código en un solo fichero al estilo de otros lenguajes como python o matlab.

Por ejemplo, para evaluar alguna de las funciones traducidas podemos simplemente copiarla y llevarlas al IDE Online [Scasite](https://scastie.scala-lang.org/):

![alt text](https://raw.githubusercontent.com/Joseram0n/PracticasMAC2021/master/imagenes/gifEjemploEvaluar.gif)


___
## :link: Enlaces de interés

 - [Documentación Haskell](https://www.haskell.org/documentation/)
 - [Documento del profesor](http://www.uhu.es/jose.carpio/N_95.pdf)
 - [Prog. Funcional Scala 1](http://www.dccia.ua.es/dccia/inf/asignaturas/LPP/2010-2011/teoria/tema6.html)
 - [Porg. Funcional Scala 2](http://www.dccia.ua.es/dccia/inf/asignaturas/LPP/2013-14/teoria/Tema06-ProgramacionFuncionalScala.pdf)
 - [Documentación Scala Oficial](https://docs.scala-lang.org/) -> Español disponible, pero en ingles la información es más completa.
 - [Foro StackOverFlow](https://stackoverflow.com/)
 - [Compilador Online Scala](https://scastie.scala-lang.org/)
 - [Página oficial Scala](https://www.scala-lang.org/)