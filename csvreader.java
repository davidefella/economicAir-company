private void initProvincia() throws FileNotFoundException, IOException {
	try (CSVReader csvReader = new CSVReader(new FileReader("file.csv"));) {
		String[] values = null;
		csvReader.readNext(); 
		while ((values = csvReader.readNext()) != null) {
			provinciaRepository.save(new Provincia(values[0],values[1],values[2]));
		}
	}
}