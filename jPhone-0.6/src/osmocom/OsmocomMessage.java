/* (C) 2012 by Richard Tynan
*  (C) 2012 by Privacy International
*
* All Rights Reserved
*
* This program is free software; you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation; either version 2 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License along
* with this program; if not, write to the Free Software Foundation, Inc.,
* 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
*
*/
package osmocom;

import java.util.StringTokenizer;

import jphone.Utils;

public class OsmocomMessage {

	private int dlci;

	private int control;

	private String data;

	public OsmocomMessage(String message) {
		StringTokenizer str = new StringTokenizer(message);
		this.dlci = Integer.parseInt(str.nextToken());
		this.control = Integer.parseInt(str.nextToken());
		this.data = Utils.chew(2, message);
	}

	public int getDlci() {
		return dlci;
	}

	public int getControl() {
		return control;
	}

	public String getData() {
		return data;
	}

}