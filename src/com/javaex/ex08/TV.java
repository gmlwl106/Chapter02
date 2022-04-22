package com.javaex.ex08;

public class TV {
	
	//필드
	private int channel;
	private int volume;
	private boolean power;
	
	//생성자
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}


	
	//메소드 gs
	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}
	
	//메소드 일반
	public void power(boolean on) {
		this.power = on;
	}
	
	public void channel(int channel) {
		if(channel >= 1 && channel <= 255) {
			this.channel = channel;
		}
	}
	
	public void channel(boolean up) {
		if(up == true) {
			channel(this.channel+1);
		} else {
			channel(this.channel-1);
		}
	}
	
	public void volume(int volume) {
		if(volume >= 0 && volume <= 100) {
			this.volume = volume;
		} else if(volume > 100) {
			this.volume = 100;
		} else if(volume < 0) {
			this.volume = 0;
		}
	}
	
	public void volume(boolean up) {
		if(up == true) {
			volume(this.volume+1);
		} else {
			volume(this.volume-1);
		}
	}
	
	public void status() {
		System.out.println("현재 TV 채널>" + channel);
		System.out.println("현재 TV 볼륨>" + volume);
		if(power == true) {
			System.out.println("현재 TV 전원>켜짐");
		} else {
			System.out.println("현재 TV 전원>꺼짐");
		}
		System.out.println();
	}
	
}
