/*
    Rockodroid: Music Player for android
    Copyright (C) 2012  Laura K. Salazar, Roberto R. De la Parra, Juan C. Orozco.

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.rockodroid.view;

import com.rockodroid.data.media.MediaStore;
import com.rockodroid.model.listadapter.PlayListListAdapter;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;

/**
 * Muestra una lista con todas las listas de reproducción registradas en el sistema.
 * @author Juan C. Orozco
 */
public class PlaylistListActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		getListView().setFastScrollEnabled(true);
		
		Context context = getApplicationContext();
		MediaStore mStore = new MediaStore(context);
		setListAdapter(new PlayListListAdapter(context, mStore.buscarPlayLists()));
	}
}
