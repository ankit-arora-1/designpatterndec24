package factory;

import factory.buttons.Button;
import factory.buttons.IOSButton;
import factory.dropdowns.Dropdown;
import factory.dropdowns.IOSDrodown;
import factory.menus.IOSMenu;
import factory.menus.Menu;

public class IOSUIFactory implements UIFactory {
    @Override
    public IOSButton createButton() {
        return new IOSButton();
    }

    @Override
    public IOSMenu createMenu() {
        return new IOSMenu();
    }

    @Override
    public IOSDrodown createDropdown() {
        return new IOSDrodown();
    }
}
