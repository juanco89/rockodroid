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
package com.rockodroid.view.notification;

import android.app.NotificationManager;
import android.content.Context;

/**
 * Clase que proporciona una interfaz rápida para la administración
 * de notificaciones en la barra de estado.
 * 
 * @author Juan C. Orozco
 */
public class NotificationHelper {

	private final Context mContext;
	private final NotificationManager nManager;
	
	public NotificationHelper(Context c) {
		this.mContext = c;
		nManager = (NotificationManager) mContext.getSystemService(Context.NOTIFICATION_SERVICE);
	}
}
