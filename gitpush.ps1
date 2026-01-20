param(

    [Parameter(Mandatory=$true)]

    [string]$Message

)



Write-Host "Adding all files..." -ForegroundColor Green

git add .



Write-Host "Committing with message: '$Message'" -ForegroundColor Green

git commit -m "$Message"



Write-Host "Pushing to origin main..." -ForegroundColor Green

git push origin main



Write-Host "Git workflow completed successfully!" -ForegroundColor Cyan