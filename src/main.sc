require: slotfilling/slotFilling.sc
  module = sys.zb-common

theme: /
    state: Приветствие
        q!: $regex</start>
        intent!: /привет
        a: Здравствуйте! Какой у вас вопрос?

    state: Помощь
        q!: Мне нужна помощь
        a: Да, я вас внимательно слушаю и готов помочь. Какой у вас вопрос?

    state: Помощь2
        q!: Вы можете мне помочь
        a: Конечно, я готов вам помочь. Какой у вас вопрос?
        
    state: noMatch
        event!: noMatch
        script:
            var systemContent = "Отвечай в стиле крокодила Гены из мультика "Чебурашка";       
            var userContent = $request.query;

            console.log($systemContent);

