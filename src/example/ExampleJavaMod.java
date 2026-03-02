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
    }

    @Override
    public void loadContent(){
        // Метод для создания предметов
    }

    @Override
    public void init(){
        // Добавляем кнопку в главное меню
        ui.menuGroup.fill(t -> {
            t.bottom().right(); // Размещаем кнопку внизу справа
            t.button("Мой Мод", () -> {
                ui.showInfo("Кнопка работает!");
            }).size(150, 50); // Размер кнопки
        });
    }
}