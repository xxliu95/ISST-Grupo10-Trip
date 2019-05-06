# ISST-Grupo10-Trip

## Gestión de Viajes en Organizaciones 
<p>
En distintas organizaciones de cierto tamaño es necesario implementar procedimientos para la gestión de gastos habituales de los empleados, como los viajes de trabajo. Tradicionalmente, la tramitación de los viajes se ha realizado en papel, incluyendo formularios para gestionar: 
</p>
 <ul>
  <li> La autorización para la realización del viaje. </li>
  <li> La justificación, aprobación y reembolso de los gastos incurridos durante el viaje. </li>
</ul>

<p>
Este proceso es tedioso y sujeto a errores, incluyendo la pérdida de documentación, los retrasos por la necesidad del envío de la documentación física, etc. Sería deseable disponer de un sistema que permitiese automatizar todas estas tareas, contribuyendo a una gestión más eficaz dentro de las organizaciones. 
</p>

### Tecnologías utilizadas
<p>
El proyecto se basa en Java de Servidor, desarrolla en Eclipse for Enterprise Java Developers, por un grupo de 6 personas utilizando el método ágil de Scrum.
Se ha utilizado un servidor Apache Tomcat v9.0 y h2 para gestionar nuestra BBDD.
</p>

### Funcionalidad del servicio 
<p>
El caso que se propone pretende dar una respuesta a esta necesidad mediante el desarrollo de un sistema que permite la gestión en línea de las distintas actividades de los procesos asociados a la comisión de un viaje y el pago de los gastos asociados. 
</p>
<p>
Mediante el uso del sistema, un empleado de la organización podrá solicitar en primer lugar la realización de un viaje, indicando los datos más relevantes como fechas y motivo. Esta solicitud deberá ser autorizada por la persona designada para ello en cada caso. 
</p>
<p>
Una vez que el viaje ha sido autorizado, el solicitante podrá comenzar la contratación de servicios de transporte, alojamiento, manutención, u otros asociados a la preparación del viaje. El sistema permitirá ir adjunto información al proceso como, por ejemplo, las facturas que se vayan emitiendo para cada concepto, o los justificantes de reuniones, tarjetas de embarque, etc. Normalmente, cuando la cantidad gastada por el empleado supera cierto umbral antes de realizar el viaje, se le permitirá solicitar un reembolso previo de cierto porcentaje de los gastos para evitar que él tenga que asumir los costes. 
</p>
<p>
Una vez concluido el viaje, el empleado deberá reportar y justificar todos los gastos incurridos, incluyendo de forma adicional toda aquella información que permita justificar los objetivos del viaje y sus resultados. 
Cuando la información está completa, el empleado enviará su solicitud de reintegro para aprobación, en primer lugar, por la persona responsable y, en último término, por el órgano de control de gastos que, si verifica que la información aportada es correcta y completa, procederá al reintegro de las cantidades adeudadas al empleado, o contactará con él para requerirle información adicional. 
</p>

### Cómo probar
##### Software necesario

- Java JDK (Java Development Kit) versión 8 o superior <br>
https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html 
- Entorno de desarrollo integrado Eclipse, con el paquete Enterprise Java Developers <br>
https://www.eclipse.org/downloads/packages/ 
- Servidor Web Apache Tomcat versión 9 <br>
https://tomcat.apache.org/download-90.cgi 
(descargar core->zip)

```
git clone https://github.com/xxliu95/ISST-Grupo10-Trip
```
##### Importación y preparación del proyecto
###### 1. Importación
```
New -> Import -> Existing Projects into Workspace
```
Seleccionas el zip clonado.
###### 2. Web dinámico
Descomprime el Apache Tomcat v9.0 e incluyelo al proyecto:
```
Eclipse -> Preferences -> Server -> Runtime Enviroments
```
###### 3. Maven y librerías
Este paso no es necesario, ya que el proyecto ya está convertido a Maven
```
Configure -> Convert to maven project. 
Path -> Configure Build Path -> Libraries  //Comprueba que está Apache Tomcat v9.0
Si no estuviera: Add Library -> Server Runtime y elija Apache Tomcat v9.0
```
##### Ejecución bajo eclipse
###### 1. Arranque del servicio H2-base de datos
Ejecuta en cmd.exe:
```
java -jar <rutacompleta>/h2-1.4.197.jar
```
Se abrirá una ventana en un navegador. Comprueba que la ruta es `jdbc:h2:tcp://localhost/~/isst` y el usuario y contraseña son `sa` y `sa` respectivamente.

###### 2. Ejecución de la aplicación Web en eclipse
En Eclipse
```
Run As -> Run on Server
y desde un navegador con el URL
http://localhost:8080/ISST-19-CRIS/
```


