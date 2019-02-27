`sbt docker:publishLocal`

`docker run -p 8080:8080 --rm --name=greeter myregistry.ru/webgreet`

`docker stop greeter`


Локальные образы
- `docker images`

Локальные контейнеры
- `docker ps`

Работа с registry
- `docker pull`
- `docker push`

Запуск и остановка
- `docker run`
    - `--rm` - удалить контейнер (не образ) после остановки
    - `-d` - detached, в фоне
    - `-p xxxx:yyyy` - прокидывание портов
    - `--name xxx` - дать название, используется в частности для stop
    - `--mount`, `--volume` - монтирование в файловую систему контейнера https://docs.docker.com/storage/bind-mounts/
- `docker stop` - по-хорошему
- `docker kill` - когда stop не помогает
