# SpringBootErrorHandle

Spring Boot @ControllerAdvice Anatosyonu kullanılarak bazı spesifik HTTO hatalrının handle etme örneklerini incelemye çalıştım.
Örneğin;

@ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<String> handleHttpMessageNotReadableException() {
        return new ResponseEntity("Gönderilen değer uygun değildir, kontrol edip tekrar deneyiniz.", HttpStatus.BAD_REQUEST);
    }
  
  HTTP Bad Request örneklerinden biri olan HttpMessageNotReadableException hatasını Bir Spirng class ı oluşturup class a @ControllerAdvice anatosyanu verdiğinizde yukarıdaki gibi @ExceptionHandler anatosyonu ile bu Exceptionu yakalayıp kendinize göre spesifik bir mesaj dönebilirsiniz.
