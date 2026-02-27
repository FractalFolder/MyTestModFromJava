package example;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import arc.scene.ui.*;
import arc.scene.ui.layout.*;
import static mindustry.Vars.*;

public class ExampleJavaMod extends Mod{

    public ExampleJavaMod(){
        Log.info("Loaded ExampleJavaMod constructor.");
    
    @Override
    public void loadContent(){
        // Здесь ты создавал предметы
    }

    // Этот метод добавляет кнопку в главное меню
    @Override
    public void init(){
        // Находим контейнер главного меню
        ui.menuGroup.fill(t -> {
            t.bottom().right(); // Ставим кнопку вниз направо
            t.button("Мой Мод", () -> {
                ui.showInfo("Кнопка работает!");
            }).size(150, 50); // Задаем размер
        });
    }
} // !!! ВАЖНО: Эта скобка закрывает класс ExampleJavaMod
