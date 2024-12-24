package factory;

public class UIFactoryFactory {
    public static UIFactory getUIFactoryFromSupportedPlatform(SupportedPlatforms supportedPlatforms) {
        if(supportedPlatforms == SupportedPlatforms.ANDROID) {
            return new AndroidUIFactory();
        } else if(supportedPlatforms == SupportedPlatforms.iOS) {
            return  new IOSUIFactory();
        } else if(supportedPlatforms == SupportedPlatforms.WEB) {
            return new WebUIFactory();
        }

        return null;
    }
}
