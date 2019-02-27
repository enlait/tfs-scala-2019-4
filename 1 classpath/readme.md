# компиляция

`javac example/Example.java`

# дизассемблирование

`javap -v example/Example.class`

# запуск

`java example.Example`

# указание classpath

Если переместить класс-файлы, они не будут доступы на пути по умолчанию:

`mkdir lib`  
`mv dep lib/dep`

classpath можно указать явно:

`java -classpath .:lib example.Example`

на classpath можно указывать jar, тогда классы будут браться из них:

`jar -cf some.jar dep/SomeClass.class`  
`rm dep/SomeClass.class`

`java -classpatch .:some.jar example.Example`

# сборка jar

`jar -cf example.jar example/Example.class dep/SomeClass.class`

# запуск из jar (classpath + main)

`java -classpath example.jar example.Example`