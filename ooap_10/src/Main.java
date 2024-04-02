// Абстрактний клас, що представляє класичну будівлю
abstract class TwoStoreyHouse {
    // Шаблонний метод, який визначає основний порядок будівництва
    public final void buildHouse() {
        buildFoundation();
        buildWalls();
        buildRoof();
        addCustomFeatures(); // Виклик віртуального методу для додавання додаткових функцій
    }

    // Методи, які будуть реалізовані в конкретних підкласах
    protected abstract void buildFoundation();
    protected abstract void buildWalls();
    protected abstract void buildRoof();

    // Віртуальний метод для додавання додаткових функцій (за замовчуванням нічого не робить)
    protected void addCustomFeatures() {}
}

// Конкретний клас, що представляє класичний двоповерховий будинок
class ClassicTwoStoreyHouse extends TwoStoreyHouse {
    @Override
    protected void buildFoundation() {
        System.out.println("Building foundation for a classic two-storey house");
    }

    @Override
    protected void buildWalls() {
        System.out.println("Building walls for a classic two-storey house");
    }

    @Override
    protected void buildRoof() {
        System.out.println("Building roof for a classic two-storey house");
    }
}

// Конкретний клас, що представляє будинок з мансардою
class HouseWithAttic extends TwoStoreyHouse {
    @Override
    protected void buildFoundation() {
        System.out.println("Building foundation for a house with an attic");
    }

    @Override
    protected void buildWalls() {
        System.out.println("Building walls for a house with an attic");
    }

    @Override
    protected void buildRoof() {
        System.out.println("Building roof for a house with an attic");
    }

    @Override
    protected void addCustomFeatures() {
        System.out.println("Adding attic to the house");
    }
}

// Конкретний клас, що представляє будинок з балконом
class HouseWithBalcony extends TwoStoreyHouse {
    @Override
    protected void buildFoundation() {
        System.out.println("Building foundation for a house with a balcony");
    }

    @Override
    protected void buildWalls() {
        System.out.println("Building walls for a house with a balcony");
    }

    @Override
    protected void buildRoof() {
        System.out.println("Building roof for a house with a balcony");
    }

    @Override
    protected void addCustomFeatures() {
        System.out.println("Adding balcony to the house");
    }
}

// Конкретний клас, що представляє будинок з гаражем
class HouseWithGarage extends TwoStoreyHouse {
    @Override
    protected void buildFoundation() {
        System.out.println("Building foundation for a house with a garage");
    }

    @Override
    protected void buildWalls() {
        System.out.println("Building walls for a house with a garage");
    }

    @Override
    protected void buildRoof() {
        System.out.println("Building roof for a house with a garage");
    }

    @Override
    protected void addCustomFeatures() {
        System.out.println("Adding garage to the house");
    }
}

// Конкретний клас, що представляє будинок з верандою
class HouseWithVeranda extends TwoStoreyHouse {
    @Override
    protected void buildFoundation() {
        System.out.println("Building foundation for a house with a veranda");
    }

    @Override
    protected void buildWalls() {
        System.out.println("Building walls for a house with a veranda");
    }

    @Override
    protected void buildRoof() {
        System.out.println("Building roof for a house with a veranda");
    }

    @Override
    protected void addCustomFeatures() {
        System.out.println("Adding veranda to the house");
    }
}

public class Main {
    public static void main(String[] args) {
        // Побудова класичного будинку
        System.out.println("Building a classic two-storey house:");
        TwoStoreyHouse classicHouse = new ClassicTwoStoreyHouse();
        classicHouse.buildHouse();

        System.out.println();

        // Побудова будинку з мансардою
        System.out.println("Building a house with an attic:");
        TwoStoreyHouse houseWithAttic = new HouseWithAttic();
        houseWithAttic.buildHouse();

        System.out.println();

        // Побудова будинку з балконом
        System.out.println("Building a house with a balcony:");
        TwoStoreyHouse houseWithBalcony = new HouseWithBalcony();
        houseWithBalcony.buildHouse();

        System.out.println();

        // Побудова будинку з гаражем
        System.out.println("Building a house with a garage:");
        TwoStoreyHouse houseWithGarage = new HouseWithGarage();
        houseWithGarage.buildHouse();

        System.out.println();

        // Побудова будинку з верандою
        System.out.println("Building a house with a veranda:");
        TwoStoreyHouse houseWithVeranda = new HouseWithVeranda();
        houseWithVeranda.buildHouse();
    }
}
