/*
 * Copyright (c) 2015 Razware Software Design
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Andrew Breksa (abreksa4@gmail.com) 5/30/2015
 */

package com.razware.blast3r.modules.TorrentDownloaders;

import com.razware.blast3r.strikeapi.Torrent;

import java.io.File;
import java.io.IOException;

/**
 * Created by abreksa on 5/30/15.
 */
public interface ITorrentDownloader {
    void download(Torrent torrent, File torrentFile) throws IOException;
}
