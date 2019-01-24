package cff.model;

/**
 * Created by ${AlexandrSerebryakov} on ${09.10.2016}.
 */
public class Description {

    private int id;
    private enum sType {FIRST_TYPE, SECOND_TYPE_FULL, SECOND_TYPE, BASTARD, FOX_GOOD, NULL};
    private enum hair {HBR, HBL, HSH, HRZ, BALD};
    private enum eye {BLUE, HAZEL, GREEN, GRAY, GETERO_CHROMIUM};
    private enum dermis {YELLOW, WHITE, DARK};
    private boolean isGoldAss;
    private enum hairOnBody {SMOOTH, HAIRED, MIDDLE, LITTLE};
    private enum bodyType {THIN, THICK, STOCKY, MIDDLE};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isGoldAss() {
        return isGoldAss;
    }

    public void setGoldAss(boolean goldAss) {
        isGoldAss = goldAss;
    }
}
