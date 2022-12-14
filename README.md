# DEV_J110_2_1

Реализуйте набор классов, при помощи которых можно описать студентов и преподавателей
вуза.
Данные обо всех персонах должны включать:
• фамилия и имя;
• пол (реализуйте его при помощи перечисления);
• название факультета.
О преподавателях дополнительно должны храниться следующие данные:
• учёная степень — кандидат наук, доктор наук, PhD (перечисление);
• название специальности.
О студентах дополнительно должны храниться следующие данные:
• для бакалавров и магистров: ступень обучения (перечисление) и номер курса;
• для аспирантов: тема диссертации.
Реализуйте метод print(), печатающий информацию о персоне:
1. Для всех должна печататься фраза «This is {name}. {He/she} {verb} at {department}», где:
   • {name}— фамилия и имя;
   • {He/she} — местоимение в зависимости от пола;
   • {verb} — глагол:
   • «teaches» для преподавателей;
   • «studies» для всех студентов.
   • {department} — название факультета.
2. В зависимости от типа персоны дополнительно должна печататься фраза:
   • для преподавателей: «{He/she} has {degree} degree in {specialty}.», где:
   • {degree} — учёная степень;
   • {specialty} — название специальности.
   • для студентов: «{He/she} is {N}‘th year {stage} student.», где:
   • {N} — номер курса;
   • {stage} — ступень обучения.
   • для аспирантов: «{His/her} thesis title is “{thesis-title}”», где:
   • {thesis-title} — тема диссертации.
   Реализуйте метод printAll, печатающий данные о персонах из заданного массива.
   Создайте массив и заполните его следующими данными:
   Преподаватели
   Имя Пол Факультет Уч. степень Специальность
   Ronald Turner M Computer science PhD Programming paradigms
   Ruth Hollings F Jurisprudence MSc Domestic arbitration
   Студенты
   Имя Пол Факультет Ступень Курс
   Leo Wilkinson M Computer science Bachelor III
   Anna Cunningham F World economy Bachelor I
   Jill Lundqvist F Jurisprudence Master I
   Аспиранты
   Имя Пол Факультет Тема диссертации
   Ronald Correa M Computer science Design of a functional programming language.
   Распечатайте содержимое массива.