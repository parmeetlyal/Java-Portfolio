public class PenPals{
  /** An array of the persons obejcts */
  private Person[] members;
  /** The number of members in the array */
  private int numMembers;
  /**Creates a PenPals object.
   * @param max represents the maximum number of members that Penpals can have
   */
  public PenPals(int max){
    members = new Person[max];
    numMembers = 0;
  }
  /** Adds new member to Penpals.
   * The new member is added at the next position available.
   * @param member the person object which is added 
   */
  public void addMember(Person member){
    members[numMembers] = member;
    numMembers += 1;
  }
  /** Returns the number of members that have been added
   * @return the number of members added
   */
  public int getNumMembers(){
    return numMembers;
  }
  /** Returns the member currently stored at a specific index
   * @param i The index of the person to be retrieved
   * @return The person at i or if invalid, null
   */
  public Person getMember(int i){
    if (i >= 0 && i < numMembers){
      return members[i];
    }
    else{
      return null;
    }
  }
  /** Deletes the member at the index specified
   * All indexes of the memebers are then reduced by one in order to fill in the gap.
   * @param i The index od the member that is to be deleted 
   */
  public void deleteMember(int i){
    while (i<numMembers-1){
      members[i] = members[i+1];
      i++;
    }
    numMembers--;
  }
}
