public class AudioPlayer implements MediaPlayer{
    @Override
    public void reproduzir(TipoMedia tipoMedia, String nome) {
        if (tipoMedia.equals(TipoMedia.MP3)){
            System.out.print("Reproduzindo MP3: " + nome);
        }

         new MediaPlayerAdapter(tipoMedia).reproduzir(tipoMedia, nome);
    }
}
