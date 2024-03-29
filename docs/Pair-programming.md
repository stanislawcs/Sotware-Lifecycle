# Впечатления от парного программирования
## 1. Описание задачи
Задание заключалось в написании механизма авторизации в приложении. 
Для простоты реализации задача была разбита на несколько частей:
1. Определение ролей в приложении.
2. Определение доступа пользователей к различным страницам, опираясь на их роли.
3. Определение способа хранения ролей в приложении.

Приложение имеет две роли: пользователь и администратор. Механизм авторизации реализовывался опираясь только на роли, 
никаких дополнительных способов доступа не определено. В своих действиях администратор и пользователь схожи, но администратор
имеет больше возможностей, в частности добавлять товар в магазин, удалять его, изменять информацию о нем. 
Также он может просматривать всех пользователей. 
Роли будут храниться в базе данных. Отношение между сущностями 'Роль' и 'Пользователь' - многие ко многим. 
Исходя из этого факта, пользователь может иметь несколько ролей. 

## 2. Выбор стиля парного программирования 
В процессе разработки приложения были испробованы несколько стилей парного программирования: 
1. 'На равных'. В этом случае работают два примерно одинаковых по опыту разработчиков, время от времени меняющихся местами;
2. 'Пинг-понг'. Один программист пишет тест, а второй – реализацию под него. После происходит смена ролей;
3. 'Удаленное парное програмиирование'. 

Данные стили нам показались самыми приемылемыми из всех возможных по нескольким причинам:
- Приблизительно одинаковый уровень опыта разработчиков.
- Возможность совместного проектирования архитектуры приложения. Из-за небольшого количества опыта невозможно будет
использовать парное программирование эффективно, если разработчики полностью не будут погружены в контекст разрабатываемого приложения. По этой причине мы и проектировали архитектуру приложения всей командой "The Quartet".
- Возможность работать над проектом удаленно. 

## 3. Презентация результата
В результате данного эксперимента мы получили следующий результат. Пользователь имеет определенный список страниц и действий, которые он может совершать. 
Например: 
- Просматривать все товары
- Просматривать отдельный товар 
- Фильтровать товары 
- Сохранять товар в корзину 
- Сделать заказ 
- Просмотреть историю своих заказов 

Администратор имеет такие же права, а также он может выполнять дополнительные действия: 
- Добавлять товар в магазин
- Удалять товар из магазина
- Изменять информацию о товаре
- Просматривать всех пользователей
 
Данный результат является ожидаемым в пределах описанных требований. 
Подход к реализации задач с помощью парного программирования оказался очень интересным и увлекательным, ведь в процессе разработки навыки у обоих разработчиков становились более устойчивыми за счет обмена опыта.
Также это дает возможность знать свой проект более детально, что не может плохо сказаться на знаниях команды. Одновременно с этим можно заметить улучшение дисциплины самих разработчиков, а соответственно и более эффективное решение поставленных задач. 

## 4. Возможные улучшения 
Больших недоработок и плохих сторон во время эксперимента выявлено не было. Но немного упало время разработки проекта. 
По нашим наблюдениям, данная задача в подобного вида проектах решается в одиночку в течение 2 дней, что равно двум story-point'ам. Решение данной задачи в рамках эксперимета заняло у нас 3 дня, т.е. 3 story-point'a. 
### 4.1 Дополнения реализации
Также можно упомянуть создание механизма сессий и хранения их в быстрых in-memory базах данных. Например, в Redis. Используя этот функционал можно не обращаться каждый раз в основную базу данных, а получать информацию о пользователе и его ролях более быстро.

## 5. Использование в будущем
Безусловно, парное программирование это мощный инструмент для улучшения навыков работы в команде, набора опыта в различных технологиях, улучшения коммуникативных навыков. 
Поэтому мы обязательно будем использовать его и в дальнейшем, особенного в проектах на микросервисной архитектуре, где для какой-либо задачи необходимо задействовать несколько микросервисов.
Соответственно, для реализации этой самой задачи каждый разработчик будет отвечать за свою часть задачи на различном микросервисе. Данный подход сократит и время работы над задачей, и улучшит знания в области взаимодействия приложений.
