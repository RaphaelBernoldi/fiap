pragma solidity 0.5.4;

contract VotosEthernosSmartContract {
    mapping(uint256 => Messages) messages;
    uint256[] public idsMessage;

    struct Messages {
        string name;
        string message;
        string imageUrl;
    }
    
    
    function addMessage(uint256  _id, string memory _name, string memory _msg,  string memory _imageUrl) public {
        messages[_id].name = _name;
        messages[_id].message = _msg;
        messages[_id].imageUrl = _imageUrl;
        idsMessage.push(_id);
    }
    
    function getIdsMessage() view public returns(uint256[] memory) {
        return idsMessage;
    }
   
        
    function getMessage(uint256 _id) view public returns (string memory, string memory, string memory) {
        return (messages[_id].name, messages[_id].message, messages[_id].imageUrl);
    }
    
}