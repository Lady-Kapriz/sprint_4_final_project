Финальный проект спринта 4 на курсе Яндекс Практикум "Автоматизатор тестирования на Java"

Техническое задание

Подготовить проект

Собери в IDE Maven-проект. Обрати внимание: нужно использовать Java 11.
Подключи JUnit 4. 
Подключи Selenium.
Установи Google Chrome и Mozilla Firefox: они понадобятся, чтобы выполнить задание.

Изучить тестовые сценарии

Тестовые сценарии:
1. Выпадающий список в разделе «Вопросы о важном». Тебе нужно проверить: когда нажимаешь на стрелочку, открывается соответствующий текст.
2. Заказ самоката. Весь флоу позитивного сценария. Обрати внимание, что есть две точки входа в сценарий: кнопка «Заказать» вверху страницы и внизу. 
Из чего состоит позитивный сценарий:
- Нажать кнопку «Заказать». На странице две кнопки заказа, нужно проверить обе.
- Заполнить форму заказа.
- Проверить, что появилось всплывающее окно с сообщением об успешном создании заказа.
Нужно написать тесты с разными данными: минимум два набора. Какие именно данные использовать — на твоё усмотрение.
Обрати внимание: в приложении есть баг, который не даёт оформить заказ. Он воспроизводится только в Chrome.
Ты можешь заметить этот баг, когда будешь писать тесты или запускать их. Ещё может случиться так: тест наткнётся на баг и упадёт. Пусть тебя это не смущает: если тест помог найти неисправность, это хорошо.

Написать тесты

Определи, какие локаторы нужны, чтобы автоматизировать тестовые сценарии. Размести в пакете класс, чтобы описать элементы главной страницы. Выпиши все элементы в список с помощью комментариев. Например:
// Заголовок страницы
// Кнопка «Войти»
// ... 
Названия должны быть понятными, чтобы с ними было удобно работать. Так ты ничего не упустишь, когда будешь искать локаторы.
Под каждым элементом в списке запиши локатор этого элемента.
Опиши необходимые локаторы с помощью Page Object.
Создай отдельный пакет для Page Object.
Для каждой страницы нужно создать отдельный класс с Page Object.
Напиши тесты на Selenium.
Организуй файлы проекта. Все тесты должны лежать в директории test. Тесты нужно разделить по тематике или функциональности. Обрати внимание: не нужно создавать отдельный класс для каждого теста. Добавь тесты на одну функциональность в один класс.
Убедись, что закрываешь браузер. Метод driver.quit(); нужно использовать в конце каждого теста.
Проверь, что тесты запускаются. Они должны проходить хотя бы в одном браузере. Нужно отправить тесты на ревью с подключённым Google Chrome.
Отчёт о тестировании не нужен.

*Написать тесты по дополнительным тестовым сценариям

Выполнять это задание необязательно: оно не повлияет на зачёт. 
Сдавать задания можно только одновременно с обязательной частью работы. Если отправишь обязательную часть на проверку, дополнительные задания сдать не получится.
Дополнительные тестовые сценарии
1. Проверить: если нажать на логотип «Самоката», попадёшь на главную страницу «Самоката».
2. Проверить: если нажать на логотип Яндекса, в новом окне откроется главная страница Яндекса.
3. Проверить ошибки для всех полей формы заказа.
4. Проверить: если ввести неправильный номер заказа, попадёшь на страницу статуса заказа. На ней должно быть написано, что такого заказа нет.