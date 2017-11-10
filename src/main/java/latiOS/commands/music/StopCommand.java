package latiOS.commands.music;

import com.jagrosh.jdautilities.commandclient.Command;
import com.jagrosh.jdautilities.commandclient.CommandEvent;

public class StopCommand extends Command {

	public StopCommand() {
		this.name = "stop";
		this.help = "Stop the currently playing music and leaves the channle";
		this.category = new Category("Music Command");
	}
	
	@Override
	protected void execute(CommandEvent event) {

	}

}
