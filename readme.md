Необходимо модернизировать приложение для рассчёта миль.

#Что для этого нужно:

Создать класс `BonusMilesService`
Определите в нём метод `calculate`, который:
Принимает на вход один параметр: `cost int`
Возвращает рассчитанное количество миль (тип - `int`)
Убедиться, что выводимое в консоль значение соответствует результатам предыдущей версии приложения:
```
public class Bonus {
    public static void main(String[] args) {
        int ticketPrice = 1060;
        int amountBonus = 20;
        int miles = ticketPrice / amountBonus;
        System.out.println(miles);

    }

}
```
