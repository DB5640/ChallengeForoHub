
<div align = "center">

<h1> ForoHub Challenge Alura </h1>

</div>

### Indice

- [Descripción del proyecto](#Descripción-del-proyecto)

- [Estado del proyecto](#Estado-del-proyecto)

- [Características de la aplicación](#Características-de-la-aplicación)

- [Acceso al proyecto](#Acceso-al-proyecto)

- [Tecnologías utilizadas](#Tecnologías-utilizadas)

- [Personas-Desarrolladores del Proyecto](#personas-desarrolladores-del-proyecto)


## Descripción del proyecto

<p> Proyecto para una api rest enfocada en topicos de un foro. </p>

<p> Datos integrados en el topico: </p>

<ul>

  <li> titulo </li>
  <li> mensaje </li>
  <li> fechaDeCreacion </li>
  <li> status </li>
  <li> autor </li>
  <li> curso </li>
  <li> respuesta </li>

</ul>

<p> Acciones integradas: </p>

<ul>

  <li> Registar topico </li>
  <li> Listar topicos </li>
  <li> Actualizar topicos </li>
  <li> Borrar topicos </li>
  <li> Login usuario </li>

</ul>


## Estado del proyecto

<p> Proyecto terminado, pero podría retomar un estado de "En desarrollo" en el futuro </p>

## Características de la aplicación

 <p> La aplicación consiste en una api rest que permite registrar, listar, actulizar y borrar datos de tópicos en una base de datos. </p>

 <p> Esta api se probo en el programa de insomnia. Lo cual se hizo de la siguiente manera:</p>
 <ul> 

<li> <strong> 1) Registrar tópico: </strong> </li>
<p> Se introdujo al enlace localhost:8080/topicos con la opción POST y se envio un JSON en el cual se toma como datos obligatórios:</p>
<li> titulo </li>
<li> mensaje </li>
<li> autor </li>
<li> curso </li>
<li> respuesta </li>
<p> Completando estos campos la api puede registrar el topico deseado </p>
<p> Sin embargo el registro asi como todas las demas acciones, solo se pueden ejecutar correctamente si se realiza la autenticación, brindada por un token JWTtoken de tipo Bearer, el cual es otorgado a un usuario registrado en la base de datos de usuario</p>
<li> <strong> 2) Listar tópicos: </strong> </li>
<p> Se introdujo al enlace localhost:8080/topicos con la opción GET, esto permite que se generen páginas de máximo 10 tópicos, para moverse entre páginas se usa ?page=x, siendo x un numero entre 0 e infinito; considerando que 0 es la página número 1</p>
<li> <strong> 3) Actualizar tópico: </strong> </li>
<p> Se introdujo al enlace localhost:8080/topicos con la opcion PUT, esto permite que se actualicen datos de topicos, que pueden ser: </p>
<li> titulo </li>
<li> mensaje </li>
<p> Introduciendo junto con estos el id del tópico a editar </p>
<li> <strong>4) Borrar topicos: </strong> </li>
<p> Se introdujo al enlace localhost:8080/topicos/x siendo x el id del topico que deseas eliminar. El cual se eliminará de manara inteligente, solo deshabilitando su visualización por medio de su estatus; true se muetra, false no se muestra</p>

 </ul>

## Acceso al proyecto

<p> <a href="https://github.com/DB5640/ChallengeForoHub" > ForoHub </a> </p>

## Tecnologías utilizadas

<p> <a href= "https://docs.oracle.com/en/java/javase/17/docs/api/index.html"> JAVA </a> </p>

<p> <a href= "https://www.exchangerate-api.com"> API Exchagerate </a> </p>

<p> <a href="https://start.spring.io/"> SPRING BOOT </a> </p>

<p> <a href="https://www.mysql.com"> MySQL </a> </p>

<p> <a href="https://insomnia.rest"> Insomnia </a> </p>

## Personas-Desarrolladores del Proyecto

<p> <a href="https://github.com/DB5640" > David Bolaños Zuluaga </a></p>












