package model;

import java.util.ArrayList;

/**
 * Se crea la clase PlayList que extiende de SongLibrary con el objetivo de crear varias play lists dentro de la aplicacion.
 *
 *    PlayList playList = new PlayList();
 *    playList.addSongToPlayList(int indexSong);
 *
 * @version 1.00.000 2022-02-14
 *
 * @authors Santiago Ospina Osorio - santiago.m200@outlook.es / Stiven Suárez Marín - ferbohi@outlook.com
 *
 * @since 1.00.000 2022-02-14
 */
public class PlayList extends SongLibrary{

    /**
     * Se le crea el atributo playList de tipo ArrayList a la clase SongLibrary
     */
    private static ArrayList<Song> playList = new ArrayList<>();

    /**
     * Se crea el metodo addSongToPlayList con el objetivo de agregar canciones al array de songs de la clase SongLibrary
     * y por ultimo las imprime.
     *
     *    playList.createPlaylist(int indexSong);
     *
     * @param indexSong int indice de la cancion que quiere agregar a la play list.
     *
     * @authors Santiago Ospina Osorio - santiago.m200@outlook.es / Stiven Suárez Marín - ferbohi@outlook.com
     *
     * @since 1.00.000 2022-02-14
     */
    public void addSongToPlayList(int indexSong){
        SongLibrary.createSongs();
        playList.add(SongLibrary.songs[indexSong-1]);
        for (int i = 0; i < playList.toArray().length ; i++) {
            System.out.println(playList.toArray()[i]);
        }
    }
}
