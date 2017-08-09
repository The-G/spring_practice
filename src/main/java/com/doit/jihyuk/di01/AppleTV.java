package com.doit.jihyuk.di01;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

@Component
public class AppleTV implements TV{ // 구상객체 AppleTV // 이 AppleTV는 TV 표준을 잘 지킨 Class 이다!!

//	private Speaker speaker;
//	public void setSpeaker(Speaker speaker) {
//		this.speaker = speaker;
//	}
	@Inject
	private Speaker speaker; // instance 생성.
							 // dependency injection
	
	public void powerOn() {
		System.out.println("AppleTV : TV를 켭니다.");
	}

	public void powerOff() {
		System.out.println("AppleTV : TV를 끕니다.");
	}

	public void channelUp() {
		System.out.println("AppleTV : 채널을 올립니다.");
	}

	public void channelDown() {
		System.out.println("AppleTV : 채널을 내립니다.");
	}

	public void soundUp() {
		if (speaker == null) {
			System.out.println("AppleTV : 소리를 키웁니다.");			
		} else {
			speaker.soundUp();
		}
	}

	public void soundDown() {
		if (speaker == null) {
			System.out.println("AppleTV : 소리를 줄입니다.");						
		} else {
			speaker.soundDown();
		}
	}

}
