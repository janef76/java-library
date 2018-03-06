public enum Genre {
    THRILLER("Exciting"),
    CRIME("Bad"),
    ETC("Anything else");

    private String description;

    Genre(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
