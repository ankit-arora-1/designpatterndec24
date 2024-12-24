package factory;

import factory.buttons.Button;
import factory.dropdowns.Dropdown;
import factory.menus.Menu;

public class WebUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return null;
    }

    @Override
    public Menu createMenu() {
        return null;
    }

    @Override
    public Dropdown createDropdown() {
        return null;
    }
}
