package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
cql3	TokenNameIdentifier
.	TokenNameDOT
operations	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
nio	TokenNameIdentifier
.	TokenNameDOT
ByteBuffer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Iterator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Set	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
cql3	TokenNameIdentifier
.	TokenNameDOT
ColumnNameBuilder	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
cql3	TokenNameIdentifier
.	TokenNameDOT
ColumnSpecification	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
cql3	TokenNameIdentifier
.	TokenNameDOT
Term	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
cql3	TokenNameIdentifier
.	TokenNameDOT
UpdateParameters	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
ColumnFamily	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
IColumn	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
marshal	TokenNameIdentifier
.	TokenNameDOT
AbstractType	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
marshal	TokenNameIdentifier
.	TokenNameDOT
CollectionType	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
marshal	TokenNameIdentifier
.	TokenNameDOT
MarshalException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
marshal	TokenNameIdentifier
.	TokenNameDOT
SetType	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
exceptions	TokenNameIdentifier
.	TokenNameDOT
InvalidRequestException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
ByteBufferUtil	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
Pair	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
SetOperation	TokenNameIdentifier
implements	TokenNameimplements
Operation	TokenNameIdentifier
{	TokenNameLBRACE
enum	TokenNameenum
Kind	TokenNameIdentifier
{	TokenNameLBRACE
SET	TokenNameIdentifier
,	TokenNameCOMMA
ADD	TokenNameIdentifier
,	TokenNameCOMMA
DISCARD	TokenNameIdentifier
}	TokenNameRBRACE
private	TokenNameprivate
final	TokenNamefinal
List	TokenNameIdentifier
<	TokenNameLESS
Term	TokenNameIdentifier
>	TokenNameGREATER
values	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
Kind	TokenNameIdentifier
kind	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
SetOperation	TokenNameIdentifier
(	TokenNameLPAREN
List	TokenNameIdentifier
<	TokenNameLESS
Term	TokenNameIdentifier
>	TokenNameGREATER
values	TokenNameIdentifier
,	TokenNameCOMMA
Kind	TokenNameIdentifier
kind	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
values	TokenNameIdentifier
=	TokenNameEQUAL
values	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
kind	TokenNameIdentifier
=	TokenNameEQUAL
kind	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
execute	TokenNameIdentifier
(	TokenNameLPAREN
ColumnFamily	TokenNameIdentifier
cf	TokenNameIdentifier
,	TokenNameCOMMA
ColumnNameBuilder	TokenNameIdentifier
builder	TokenNameIdentifier
,	TokenNameCOMMA
AbstractType	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
validator	TokenNameIdentifier
,	TokenNameCOMMA
UpdateParameters	TokenNameIdentifier
params	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
Pair	TokenNameIdentifier
<	TokenNameLESS
ByteBuffer	TokenNameIdentifier
,	TokenNameCOMMA
IColumn	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
list	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
InvalidRequestException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
(	TokenNameLPAREN
validator	TokenNameIdentifier
instanceof	TokenNameinstanceof
SetType	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
InvalidRequestException	TokenNameIdentifier
(	TokenNameLPAREN
"Set operations are only supported on Set typed columns, but "	TokenNameStringLiteral
+	TokenNamePLUS
validator	TokenNameIdentifier
+	TokenNamePLUS
" given."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
switch	TokenNameswitch
(	TokenNameLPAREN
kind	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
SET	TokenNameIdentifier
:	TokenNameCOLON
cf	TokenNameIdentifier
.	TokenNameDOT
addAtom	TokenNameIdentifier
(	TokenNameLPAREN
params	TokenNameIdentifier
.	TokenNameDOT
makeTombstoneForOverwrite	TokenNameIdentifier
(	TokenNameLPAREN
builder	TokenNameIdentifier
.	TokenNameDOT
copy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
build	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
builder	TokenNameIdentifier
.	TokenNameDOT
copy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
buildAsEndOfRange	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
case	TokenNamecase
ADD	TokenNameIdentifier
:	TokenNameCOLON
doAdd	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
,	TokenNameCOMMA
builder	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
CollectionType	TokenNameIdentifier
)	TokenNameRPAREN
validator	TokenNameIdentifier
,	TokenNameCOMMA
params	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
DISCARD	TokenNameIdentifier
:	TokenNameCOLON
doDiscard	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
,	TokenNameCOMMA
builder	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
CollectionType	TokenNameIdentifier
)	TokenNameRPAREN
validator	TokenNameIdentifier
,	TokenNameCOMMA
params	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
throw	TokenNamethrow
new	TokenNamenew
AssertionError	TokenNameIdentifier
(	TokenNameLPAREN
"Unsupported Set operation: "	TokenNameStringLiteral
+	TokenNamePLUS
kind	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
doSetFromPrepared	TokenNameIdentifier
(	TokenNameLPAREN
ColumnFamily	TokenNameIdentifier
cf	TokenNameIdentifier
,	TokenNameCOMMA
ColumnNameBuilder	TokenNameIdentifier
builder	TokenNameIdentifier
,	TokenNameCOMMA
SetType	TokenNameIdentifier
validator	TokenNameIdentifier
,	TokenNameCOMMA
Term	TokenNameIdentifier
values	TokenNameIdentifier
,	TokenNameCOMMA
UpdateParameters	TokenNameIdentifier
params	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
InvalidRequestException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
values	TokenNameIdentifier
.	TokenNameDOT
isBindMarker	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
InvalidRequestException	TokenNameIdentifier
(	TokenNameLPAREN
"Can't apply operation on column with "	TokenNameStringLiteral
+	TokenNamePLUS
validator	TokenNameIdentifier
+	TokenNamePLUS
" type."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cf	TokenNameIdentifier
.	TokenNameDOT
addAtom	TokenNameIdentifier
(	TokenNameLPAREN
params	TokenNameIdentifier
.	TokenNameDOT
makeTombstoneForOverwrite	TokenNameIdentifier
(	TokenNameLPAREN
builder	TokenNameIdentifier
.	TokenNameDOT
copy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
build	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
builder	TokenNameIdentifier
.	TokenNameDOT
copy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
buildAsEndOfRange	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
doAddFromPrepared	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
,	TokenNameCOMMA
builder	TokenNameIdentifier
,	TokenNameCOMMA
validator	TokenNameIdentifier
,	TokenNameCOMMA
values	TokenNameIdentifier
,	TokenNameCOMMA
params	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
doAddFromPrepared	TokenNameIdentifier
(	TokenNameLPAREN
ColumnFamily	TokenNameIdentifier
cf	TokenNameIdentifier
,	TokenNameCOMMA
ColumnNameBuilder	TokenNameIdentifier
builder	TokenNameIdentifier
,	TokenNameCOMMA
SetType	TokenNameIdentifier
validator	TokenNameIdentifier
,	TokenNameCOMMA
Term	TokenNameIdentifier
values	TokenNameIdentifier
,	TokenNameCOMMA
UpdateParameters	TokenNameIdentifier
params	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
InvalidRequestException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
values	TokenNameIdentifier
.	TokenNameDOT
isBindMarker	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
InvalidRequestException	TokenNameIdentifier
(	TokenNameLPAREN
"Can't apply operation on column with "	TokenNameStringLiteral
+	TokenNamePLUS
validator	TokenNameIdentifier
+	TokenNamePLUS
" type."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
Set	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
s	TokenNameIdentifier
=	TokenNameEQUAL
validator	TokenNameIdentifier
.	TokenNameDOT
compose	TokenNameIdentifier
(	TokenNameLPAREN
params	TokenNameIdentifier
.	TokenNameDOT
variables	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
values	TokenNameIdentifier
.	TokenNameDOT
bindIndex	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Iterator	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
iter	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
iter	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
ColumnNameBuilder	TokenNameIdentifier
b	TokenNameIdentifier
=	TokenNameEQUAL
iter	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
?	TokenNameQUESTION
builder	TokenNameIdentifier
.	TokenNameDOT
copy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
builder	TokenNameIdentifier
;	TokenNameSEMICOLON
ByteBuffer	TokenNameIdentifier
name	TokenNameIdentifier
=	TokenNameEQUAL
b	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
validator	TokenNameIdentifier
.	TokenNameDOT
nameComparator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
decompose	TokenNameIdentifier
(	TokenNameLPAREN
iter	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
build	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cf	TokenNameIdentifier
.	TokenNameDOT
addColumn	TokenNameIdentifier
(	TokenNameLPAREN
params	TokenNameIdentifier
.	TokenNameDOT
makeColumn	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
,	TokenNameCOMMA
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
EMPTY_BYTE_BUFFER	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
MarshalException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
InvalidRequestException	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
doDiscardFromPrepared	TokenNameIdentifier
(	TokenNameLPAREN
ColumnFamily	TokenNameIdentifier
cf	TokenNameIdentifier
,	TokenNameCOMMA
ColumnNameBuilder	TokenNameIdentifier
builder	TokenNameIdentifier
,	TokenNameCOMMA
SetType	TokenNameIdentifier
validator	TokenNameIdentifier
,	TokenNameCOMMA
Term	TokenNameIdentifier
values	TokenNameIdentifier
,	TokenNameCOMMA
UpdateParameters	TokenNameIdentifier
params	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
InvalidRequestException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
values	TokenNameIdentifier
.	TokenNameDOT
isBindMarker	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
InvalidRequestException	TokenNameIdentifier
(	TokenNameLPAREN
"Can't apply operation on column with "	TokenNameStringLiteral
+	TokenNamePLUS
validator	TokenNameIdentifier
+	TokenNamePLUS
" type."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
Set	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
s	TokenNameIdentifier
=	TokenNameEQUAL
validator	TokenNameIdentifier
.	TokenNameDOT
compose	TokenNameIdentifier
(	TokenNameLPAREN
params	TokenNameIdentifier
.	TokenNameDOT
variables	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
values	TokenNameIdentifier
.	TokenNameDOT
bindIndex	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Iterator	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
iter	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
iter	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
ColumnNameBuilder	TokenNameIdentifier
b	TokenNameIdentifier
=	TokenNameEQUAL
iter	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
?	TokenNameQUESTION
builder	TokenNameIdentifier
.	TokenNameDOT
copy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
builder	TokenNameIdentifier
;	TokenNameSEMICOLON
ByteBuffer	TokenNameIdentifier
name	TokenNameIdentifier
=	TokenNameEQUAL
b	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
validator	TokenNameIdentifier
.	TokenNameDOT
nameComparator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
decompose	TokenNameIdentifier
(	TokenNameLPAREN
iter	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
build	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cf	TokenNameIdentifier
.	TokenNameDOT
addColumn	TokenNameIdentifier
(	TokenNameLPAREN
params	TokenNameIdentifier
.	TokenNameDOT
makeTombstone	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
MarshalException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
InvalidRequestException	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
doAdd	TokenNameIdentifier
(	TokenNameLPAREN
ColumnFamily	TokenNameIdentifier
cf	TokenNameIdentifier
,	TokenNameCOMMA
ColumnNameBuilder	TokenNameIdentifier
builder	TokenNameIdentifier
,	TokenNameCOMMA
CollectionType	TokenNameIdentifier
validator	TokenNameIdentifier
,	TokenNameCOMMA
UpdateParameters	TokenNameIdentifier
params	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
InvalidRequestException	TokenNameIdentifier
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
values	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
++	TokenNamePLUS_PLUS
i	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ColumnNameBuilder	TokenNameIdentifier
b	TokenNameIdentifier
=	TokenNameEQUAL
i	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
values	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
1	TokenNameIntegerLiteral
?	TokenNameQUESTION
builder	TokenNameIdentifier
:	TokenNameCOLON
builder	TokenNameIdentifier
.	TokenNameDOT
copy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ByteBuffer	TokenNameIdentifier
name	TokenNameIdentifier
=	TokenNameEQUAL
b	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
values	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getByteBuffer	TokenNameIdentifier
(	TokenNameLPAREN
validator	TokenNameIdentifier
.	TokenNameDOT
nameComparator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
params	TokenNameIdentifier
.	TokenNameDOT
variables	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
build	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cf	TokenNameIdentifier
.	TokenNameDOT
addColumn	TokenNameIdentifier
(	TokenNameLPAREN
params	TokenNameIdentifier
.	TokenNameDOT
makeColumn	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
,	TokenNameCOMMA
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
EMPTY_BYTE_BUFFER	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
doDiscard	TokenNameIdentifier
(	TokenNameLPAREN
ColumnFamily	TokenNameIdentifier
cf	TokenNameIdentifier
,	TokenNameCOMMA
ColumnNameBuilder	TokenNameIdentifier
builder	TokenNameIdentifier
,	TokenNameCOMMA
CollectionType	TokenNameIdentifier
validator	TokenNameIdentifier
,	TokenNameCOMMA
UpdateParameters	TokenNameIdentifier
params	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
InvalidRequestException	TokenNameIdentifier
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
values	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
++	TokenNamePLUS_PLUS
i	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ColumnNameBuilder	TokenNameIdentifier
b	TokenNameIdentifier
=	TokenNameEQUAL
i	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
values	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
1	TokenNameIntegerLiteral
?	TokenNameQUESTION
builder	TokenNameIdentifier
:	TokenNameCOLON
builder	TokenNameIdentifier
.	TokenNameDOT
copy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ByteBuffer	TokenNameIdentifier
name	TokenNameIdentifier
=	TokenNameEQUAL
b	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
values	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getByteBuffer	TokenNameIdentifier
(	TokenNameLPAREN
validator	TokenNameIdentifier
.	TokenNameDOT
nameComparator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
params	TokenNameIdentifier
.	TokenNameDOT
variables	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
build	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cf	TokenNameIdentifier
.	TokenNameDOT
addColumn	TokenNameIdentifier
(	TokenNameLPAREN
params	TokenNameIdentifier
.	TokenNameDOT
makeTombstone	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addBoundNames	TokenNameIdentifier
(	TokenNameLPAREN
ColumnSpecification	TokenNameIdentifier
column	TokenNameIdentifier
,	TokenNameCOMMA
ColumnSpecification	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
boundNames	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
InvalidRequestException	TokenNameIdentifier
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
Term	TokenNameIdentifier
t	TokenNameIdentifier
:	TokenNameCOLON
values	TokenNameIdentifier
)	TokenNameRPAREN
if	TokenNameif
(	TokenNameLPAREN
t	TokenNameIdentifier
.	TokenNameDOT
isBindMarker	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
boundNames	TokenNameIdentifier
[	TokenNameLBRACKET
t	TokenNameIdentifier
.	TokenNameDOT
bindIndex	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
column	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
List	TokenNameIdentifier
<	TokenNameLESS
Term	TokenNameIdentifier
>	TokenNameGREATER
getValues	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
values	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
requiresRead	TokenNameIdentifier
(	TokenNameLPAREN
AbstractType	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
validator	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Type	TokenNameIdentifier
getType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
Type	TokenNameIdentifier
.	TokenNameDOT
SET	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Operation	TokenNameIdentifier
Set	TokenNameIdentifier
(	TokenNameLPAREN
List	TokenNameIdentifier
<	TokenNameLESS
Term	TokenNameIdentifier
>	TokenNameGREATER
values	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
SetOperation	TokenNameIdentifier
(	TokenNameLPAREN
values	TokenNameIdentifier
,	TokenNameCOMMA
Kind	TokenNameIdentifier
.	TokenNameDOT
SET	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Operation	TokenNameIdentifier
Add	TokenNameIdentifier
(	TokenNameLPAREN
List	TokenNameIdentifier
<	TokenNameLESS
Term	TokenNameIdentifier
>	TokenNameGREATER
values	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
SetOperation	TokenNameIdentifier
(	TokenNameLPAREN
values	TokenNameIdentifier
,	TokenNameCOMMA
Kind	TokenNameIdentifier
.	TokenNameDOT
ADD	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Operation	TokenNameIdentifier
Discard	TokenNameIdentifier
(	TokenNameLPAREN
List	TokenNameIdentifier
<	TokenNameLESS
Term	TokenNameIdentifier
>	TokenNameGREATER
values	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
SetOperation	TokenNameIdentifier
(	TokenNameLPAREN
values	TokenNameIdentifier
,	TokenNameCOMMA
Kind	TokenNameIdentifier
.	TokenNameDOT
DISCARD	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
