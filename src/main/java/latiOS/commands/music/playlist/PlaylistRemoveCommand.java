package latiOS.commands.music.playlist;

import com.jagrosh.jdautilities.commandclient.Command;
import com.jagrosh.jdautilities.commandclient.CommandEvent;

public class PlaylistRemoveCommand extends Command {

	public PlaylistRemoveCommand() {
		this.name = "remove";
		this.help = "Removes a song from the playlist";
		this.arguments = "<playlist name> <song name>";
	}
	
	@Override
	protected void execute(CommandEvent event) {
	}

}
