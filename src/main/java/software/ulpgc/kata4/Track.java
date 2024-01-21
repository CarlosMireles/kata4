package software.ulpgc.kata4;

public record Track(String track, int milliseconds, double unitPrice, String album, String genre, String artist) {
    @Override
    public String track() {
        return track;
    }

    @Override
    public int milliseconds() {
        return milliseconds;
    }

    @Override
    public double unitPrice() {
        return unitPrice;
    }

    @Override
    public String album() {
        return album;
    }

    @Override
    public String genre() {
        return genre;
    }

    @Override
    public String artist() {
        return artist;
    }
}
