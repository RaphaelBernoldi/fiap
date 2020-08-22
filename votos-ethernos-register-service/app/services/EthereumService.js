const abi =require('../models/AbiVotosEthernos');


module.exports =  {

  
  connect: () => {
    console.log('CONNECTING...')

    const Web3 = require('web3')
    const contractAddress = '0xfB483BE30a3B43830631D0b491fe314BeA146661';


    var web3 = new Web3('https://goerli.etherscan.io');

    var contract = new web3.eth.Contract([
      {
        "constant": false,
        "inputs": [
          {
            "name": "_id",
            "type": "uint256"
          },
          {
            "name": "_name",
            "type": "string"
          },
          {
            "name": "_msg",
            "type": "string"
          },
          {
            "name": "_imageUrl",
            "type": "string"
          }
        ],
        "name": "addMessage",
        "outputs": [],
        "payable": false,
        "stateMutability": "nonpayable",
        "type": "function"
      },
      {
        "constant": true,
        "inputs": [],
        "name": "getIdsMessage",
        "outputs": [
          {
            "name": "",
            "type": "uint256[]"
          }
        ],
        "payable": false,
        "stateMutability": "view",
        "type": "function"
      },
      {
        "constant": true,
        "inputs": [
          {
            "name": "_id",
            "type": "uint256"
          }
        ],
        "name": "getMessage",
        "outputs": [
          {
            "name": "",
            "type": "string"
          },
          {
            "name": "",
            "type": "string"
          },
          {
            "name": "",
            "type": "string"
          }
        ],
        "payable": false,
        "stateMutability": "view",
        "type": "function"
      },
      {
        "constant": true,
        "inputs": [
          {
            "name": "",
            "type": "uint256"
          }
        ],
        "name": "idsMessage",
        "outputs": [
          {
            "name": "",
            "type": "uint256"
          }
        ],
        "payable": false,
        "stateMutability": "view",
        "type": "function"
      }
    ], contractAddress);

      var service = {}
      // Accounts
      var account;

      web3.eth.getAccounts(function(err, accounts) {
        if (err != null) {
          
          console.log(err)
          return;
        }
        if (accounts.length == 0) {
          console.log("Nenhuma conta encontrada! Verifique se o Ethereum client está configurado corretamente.");
          return;
        }
        account = accounts[0];
        console.log('Account: ' + account);
        web3.eth.defaultAccount = account;
      });


  },

  createMessage: (message) => {
    this.connect()
    console.log(message  + "Post executado");

  },
  
  listAllMessage: () => {
    
    console.log('Listando o brasilsao');
  }

}