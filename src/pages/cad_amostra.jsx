export default function Cad_Amostra() {
  const typesSetors = ["Borracha", "Injetado","Almoxarifado", "Protótipo"];

  return (
    <div>
      <form method="POST">
        <div>
          <label htmlFor="type">Setor</label>
          <select name="type" id="type">
            <option value="">Escolha o setor de referência</option>
            {typesSetors.map((opt) => (
              <option key={opt} value={opt}>{opt}</option>
            ))}
          </select>
        </div>

        <div>
          <label htmlFor="numberRef">Número de Referência</label>
          <input type="text" name="numberRef" id="numberRef" />
        </div>

        <div>
          <label htmlFor="modeloRef">Modelo de Referência</label>
          <input type="text" name="modeloRef" id="modeloRef"/>
        </div>

        
      </form>
    </div>
  );
}
