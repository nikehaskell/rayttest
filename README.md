# rayttest
Тест на определение рейтинга компьютерной игры
Компиляция под Windows
----------------------
Скачать репозиторий в виде архива и распаковать в любую папку

Создать папку rayttest и скопировать в нее папку src

Запустить консоль и перейдите в папку rayttest

Выполните:

- mkdir bin
- javac -sourcepath .\src\ -d .\bin\ .\src\rayt\Rayt.java -encoding UTF-8
- echo main-class: rayt.Rayt>manifest.mf
- cd bin
- jar cfm rayt.jar ..\manifest.mf .\*
