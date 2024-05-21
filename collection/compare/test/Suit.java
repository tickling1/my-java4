package collection.compare.test;

public enum Suit {
    SPADE("\u2660"), // 스페이드
    HEART("\u2665"), // 하트
    DIAMOND("\u2666"), // 다이아
    CLUB("\u2663"); // 클로버

    private String icon;

    Suit(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }
}
