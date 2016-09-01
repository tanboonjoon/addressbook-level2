package seedu.addressbook.data.person;
/**
 * 
 * Represent Block in a address
 *
 */
public class Block {
	

	private  String blockNo;
	
	public Block() {}
	
	public Block(String blockNo) {
		this.blockNo = blockNo;
	}
	
	//getter method
	public String getBlockNo() {
		return blockNo;
	}
	
    //setter method
	public void setBlockNo(String blockNo) {
		this.blockNo = blockNo;
	}

}
