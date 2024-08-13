package anonymousTask;

public class Building {
	public static void main(String[] args) {
//      Nike gangnam = new Nike();
//      gangnam.register(new FormAdapter() {
//
//         @Override
//         public String[] getMenu() {
//            return new String[] {"에어 포스","조던"}; 
//         }
//      });
      
      Nike jamsil = new Nike();
      jamsil.register(new Form() {
    	  
    	  @Override
			public void sell(String order) {
				String[] menu = getMenu();
				for (int i = 0; i < menu.length; i++) {
					if(menu[i].equals(order)) {
						System.out.println(order + "판매 완료");
        		 }
        	 }
    	  }
        	 @Override
             public String[] getMenu() {
                return new String[] {"에어 포스", "에어 맥스"};
        	  
         }
         
      });
      
    }  
}