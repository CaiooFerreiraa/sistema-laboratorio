import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react'

// https://vite.dev/config/
export default defineConfig({
  plugins: [react()],
  server: {
    port: 8080, // coloque a porta que quiser aqui
    strictPort: true // isso impede que o Vite mude de porta automaticamente se a porta estiver ocupada
  }
})
