public interface ServiceTransport {
    void updateTyre();

    void checkEngine();

    void checkTrailer();

    void check(Car[] car);

    void check(Truck[] truck);

    void check(Bicycle[] bicycle);

}
