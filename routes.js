import express from 'express';
import LoginController  from './src/controllers/LoginController.js'

const router = express.Router();

router.get("/", LoginController.index)

export default router;