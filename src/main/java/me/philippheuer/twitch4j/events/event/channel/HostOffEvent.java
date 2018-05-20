package me.philippheuer.twitch4j.events.event.channel;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Value;
import me.philippheuer.twitch4j.events.event.ChannelBaseEvent;
import me.philippheuer.twitch4j.model.Channel;

/**
 * This event gets called when the user stops hosting someone.
 *
 * @author Philipp Heuer [https://github.com/PhilippHeuer]
 * @version %I%, %G%
 * @since 1.0
 */
@Value
@Getter
@EqualsAndHashCode(callSuper = false)
public class HostOffEvent extends ChannelBaseEvent {

	/**
	 * Event Constructor
	 *
	 * @param channel The channel that this event originates from.
	 */
	public HostOffEvent(Channel channel) {
		super(channel);
	}

}
