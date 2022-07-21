public class MediaPlayerAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(TipoMedia tipo) {
        if (tipo != TipoMedia.MP3) {
            this.advancedMediaPlayer = new VideoMediaPlayer();
        }
    }


    @Override
    public void reproduzir(TipoMedia tipoMedia, String nome) {
        if (tipoMedia.equals(TipoMedia.MP4)) {
            this.advancedMediaPlayer.reproduzirMp4(nome);
        } else if (tipoMedia.equals(TipoMedia.VLC)) {
            this.advancedMediaPlayer.reproduzirVlc(nome);
        }
    }
}