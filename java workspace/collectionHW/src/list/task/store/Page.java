package list.task.store;

import java.util.ArrayList;

import list.task.DBConnecter;

public class Page {
	public static void main(String[] args) {
		
		App 카카오톡 = new App("카카오톡", "SNS", 1000, "무료");
		App 인스타그램 = new App("인스타그램", "SNS", 500, "무료");
		App 마인크래프트 = new App("마인크래프트", "Game",3300, "10000");
		App HrdNet = new App("HRD-net", "Info", 1300, "무료");
		
		AppStore appStore = new AppStore();
		ArrayList<AppStore> apps = null;
		
		if(appStore.checkAppName("카카오톡") == null) {
			appStore.add(카카오톡);
		}
		if(appStore.checkAppName("인스타그램") == null) {
			appStore.add(인스타그램);
		}
		if(appStore.checkAppName("마인크래프트") == null) {
			appStore.add(마인크래프트);
		}
		if(appStore.checkAppName("HRD-net") == null) {
			appStore.add(마인크래프트);
		}
		System.out.println(DBConnecter.apps);
	}
}
