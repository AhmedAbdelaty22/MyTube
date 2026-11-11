public class XVideoEncoder implements VideoEncoder {

    @Override
    public void encode(Video video) {
        IO.println("Encoding video...");
        IO.println("Done!\n");
    }
}
