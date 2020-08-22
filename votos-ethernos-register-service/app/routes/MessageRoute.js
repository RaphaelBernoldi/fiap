const router = require('express').Router();
const messageGet = require('../controllers/message/get');
const messagePost = require('../controllers/message/post');


const ENDPOINT_V1_DEFAULT_MESSAGE = '/votos-ethernos-register-service/v1/message';
//console.log('Carregando endPoints::' + ENDPOINT_V1_DEFAULT_MESSAGE + ' controller:: ' + messageGet + messagePost)

router.post(ENDPOINT_V1_DEFAULT_MESSAGE,  messagePost);
router.get(ENDPOINT_V1_DEFAULT_MESSAGE, messageGet );

module.exports = router 

