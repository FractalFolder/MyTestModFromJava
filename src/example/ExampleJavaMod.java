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

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("frog");
                dialog.cont.add("behold").row();
                //mod sprites are prefixed with the mod name (this mod is called 'example-java-mod' in its config)
                dialog.cont.image(Core.atlas.find("example-java-mod-frog")).pad(20f).row();
                dialog.cont.button("I see", dialog::hide).size(100f, 50f);
                dialog.show();
            });
        });
    }

    @Override
    public void loadContent(){
        // Создаем новый предмет "Кристалл Пустоты"
        new Item("void-crystal") {{
            localizedName = "Кристалл Пустоты";
            description = "Очень редкий и нестабильный ресурс.";
            color = Color.valueOf("8e44ad"); // Фиолетовый цвет
            explosiveness = 0.5f; // Он немного взрывоопасен!
            flammability = 0.1f;
        }};
    }
    
    @Override
    public void init(){
        // Добавляем кнопку в главное меню
        ui.menuGroup.fill(t -> {
            t.bottom().right(); // Размещаем кнопку внизу справа
            t.button("Моя Кнопка", () -> {
                // Действие при нажатии кнопки
                ui.showInfo("Привет! Это кнопка из моего мода.");
            }).size(150, 50); // Размер кнопки
        });
}
