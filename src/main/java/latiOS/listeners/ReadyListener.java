package latiOS.listeners;

import latiOS.exceptions.MultiServerException;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.events.Event;
import net.dv8tion.jda.core.events.ReadyEvent;
import net.dv8tion.jda.core.hooks.EventListener;
import net.dv8tion.jda.core.utils.SimpleLog;

public class ReadyListener implements EventListener {
	
	private static final SimpleLog log = SimpleLog.getLog("LatiOS");
	
	public void onEvent(Event event) {
		if (event instanceof ReadyEvent) {
			if (event.getJDA().getGuilds().size()>1) {
				log.fatal(new MultiServerException());
				event.getJDA().shutdown();
			}
			event.getJDA().getPresence().setStatus(OnlineStatus.ONLINE);
			log.info("LatiOS ready to go!");	
		}
	}
}
